package com.example.android.musicalstructure;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

public class ExperiencerlActivity extends Activity {
    /** Called when album button is clicked. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.album);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });
    }
}

public class ExperiencerlActivity extends Activity {
    /** Called when song button is clicked. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.song);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });
    }
}

public class ExperiencerlActivity extends Activity {
    /** Called when playlist button is clicked. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.playlist);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });
    }
}

public class ExperiencerlActivity extends Activity {
    /** Called when album button is clicked. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.artist);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });
    }
}

{
        "mimetype": "",
        "name": "Search and play Album",
        "package": "",
        "target": "Activity",
        "data": "",
        "action": "android.media.action.MEDIA_PLAY_FROM_SEARCH",
        "class": "",
        "categories": [
        {
        "category": "android.intent.category.DEFAULT"
        }
        ],
        "extras": [
        {
        "type": "String",
        "description": "The Album to play (repeat the album here)",
        "key": "query",
        "name": "Album",
        "default": ""
        },
        {
        "type": "String",
        "description": "Required. Do not change this value",
        "key": "android.intent.extra.focus",
        "name": "Album Type",
        "default": "vnd.android.cursor.item/album"
        }
        ],
        "id": "SEARCH_AND_PLAY_ALBUM",
        "appname": "Media"
        }

        {
        "mimetype": "",
        "name": "Search and play Artist",
        "package": "",
        "target": "Activity",
        "data": "",
        "action": "android.media.action.MEDIA_PLAY_FROM_SEARCH",
        "class": "",
        "categories": [
        {
        "category": "android.intent.category.DEFAULT"
        }
        ],
        "extras": [
        {
        "type": "String",
        "description": "The Artist to play",
        "key": "query",
        "name": "Artist",
        "default": ""
        },
        {
        "type": "String",
        "description": "Required. Do not change this value",
        "key": "android.intent.extra.focus",
        "name": "Artist Type",
        "default": "vnd.android.cursor.item/artist"
        }
        ],
        "id": "SEARCH_AND_PLAY_ARTIST",
        "appname": "Media"
        }

        {
        "mimetype": "",
        "name": "Search and play Song",
        "package": "",
        "target": "Activity",
        "data": "",
        "action": "android.media.action.MEDIA_PLAY_FROM_SEARCH",
        "class": "",
        "categories": [
        {
        "category": "android.intent.category.DEFAULT"
        }
        ],
        "extras": [
        {
        "type": "String",
        "description": "The Song to play",
        "key": "query",
        "name": "Song",
        "default": ""
        },
        {
        "type": "String",
        "description": "Required. Do not change this value",
        "key": "android.intent.extra.focus",
        "name": "Song Type",
        "default": "vnd.android.cursor.item/audio"
        }
        ],
        "id": "SEARCH_AND_PLAY_SONG",
        "appname": "Media"
        }

        {
        "mimetype": "",
        "name": "Search and play Playlist",
        "package": "",
        "target": "Activity",
        "data": "",
        "action": "android.media.action.MEDIA_PLAY_FROM_SEARCH",
        "class": "",
        "categories": [
        {
        "category": "android.intent.category.DEFAULT"
        }
        ],
        "extras": [
        {
        "type": "String",
        "description": "The Playlist to play",
        "key": "query",
        "name": "Playlist",
        "default": ""
        },
        {
        "type": "String",
        "description": "Required. Do not change this value",
        "key": "android.intent.extra.focus",
        "name": "Playlist Type",
        "default": "vnd.android.cursor.item/playlist"
        }
        ],
        "id": "SEARCH_AND_PLAY_PLAYLIST",
        "appname": "Media"
        }