package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.hv */
/* compiled from: PG */
public enum C14400hv {
    USER_TRIGGERED_OPEN_MEDIA_BROWSE,
    USER_TRIGGERED_PLAY_MEDIA_BROWSE_ITEM,
    USER_TRIGGERED_OPEN_APP,
    USER_TRIGGERED_MEDIA_PLAY_INITIATION,
    USER_TRIGGERED_FETCH_MEDIA_MENU_ITEMS,
    USER_TRIGGERED_GO_TO_PREV_TREE_DIRECTORY,
    MEDIABROWSEEVENT_NOT_SET;

    /* renamed from: a */
    public static C14400hv m30616a(int i) {
        if (i == 0) {
            return MEDIABROWSEEVENT_NOT_SET;
        }
        if (i == 1) {
            return USER_TRIGGERED_OPEN_MEDIA_BROWSE;
        }
        if (i == 2) {
            return USER_TRIGGERED_PLAY_MEDIA_BROWSE_ITEM;
        }
        if (i == 3) {
            return USER_TRIGGERED_OPEN_APP;
        }
        if (i == 4) {
            return USER_TRIGGERED_MEDIA_PLAY_INITIATION;
        }
        if (i == 6) {
            return USER_TRIGGERED_FETCH_MEDIA_MENU_ITEMS;
        }
        if (i != 7) {
            return null;
        }
        return USER_TRIGGERED_GO_TO_PREV_TREE_DIRECTORY;
    }
}
