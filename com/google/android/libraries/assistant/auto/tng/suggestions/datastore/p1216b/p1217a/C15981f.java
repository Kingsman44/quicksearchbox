package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15975a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15986b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.f */
/* compiled from: PG */
public final class C15981f implements C15975a {

    /* renamed from: a */
    private final Context f47389a;

    public C15981f(Context context) {
        this.f47389a = context;
    }

    /* renamed from: a */
    public final String mo22642a(C16090ap apVar, C16327aa aaVar, boolean z, int i, String str) {
        C58976aa aaVar2 = C58975e.f156826a;
        if (z) {
            if (i == 2) {
                C16327aa aaVar3 = C16327aa.UNKNOWN_ACTION_TYPE;
                int ordinal = aaVar.ordinal();
                if (ordinal == 5) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_call_active_icon).toString();
                }
                if (ordinal == 6) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_message_active_icon).toString();
                }
                if (ordinal == 13) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_media_active_icon).toString();
                }
            } else {
                C16327aa aaVar4 = C16327aa.UNKNOWN_ACTION_TYPE;
                int ordinal2 = aaVar.ordinal();
                if (ordinal2 == 5) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_call_inactive_icon).toString();
                }
                if (ordinal2 == 6) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_message_inactive_icon).toString();
                }
                if (ordinal2 == 13) {
                    return C15986b.m32805a(this.f47389a, R.drawable.shortcut_media_inactive_icon).toString();
                }
            }
            return BuildConfig.FLAVOR;
        }
        C16327aa aaVar5 = C16327aa.UNKNOWN_ACTION_TYPE;
        int ordinal3 = aaVar.ordinal();
        if (!(ordinal3 == 1 || ordinal3 == 2)) {
            if (ordinal3 != 32) {
                switch (ordinal3) {
                    case 4:
                    case 6:
                    case 9:
                        return C15986b.m32805a(this.f47389a, R.drawable.suggestion_homescreen_message_icon).toString();
                    case 5:
                        break;
                    case 7:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return C15986b.m32805a(this.f47389a, R.drawable.suggestion_homescreen_navigation_icon).toString();
                    case 13:
                        break;
                    default:
                        return C15986b.m32805a(this.f47389a, R.drawable.suggestion_widget_opa_icon).toString();
                }
            }
            return C15986b.m32805a(this.f47389a, R.drawable.suggestion_homescreen_play_music_icon).toString();
        }
        return C15986b.m32805a(this.f47389a, R.drawable.suggestion_widget_call_icon).toString();
    }
}
