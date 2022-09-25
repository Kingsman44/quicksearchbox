package com.google.android.apps.search.transcription.p10666b;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.transcription.b.t */
/* compiled from: PG */
public final class C141761t {
    /* renamed from: a */
    public static String m229997a(Context context, C141743b bVar, boolean z) {
        int d = bVar.mo116705d();
        int i = d - 1;
        if (d != 0) {
            switch (i) {
                case 0:
                case 1:
                case 4:
                case 6:
                case 9:
                case 10:
                    return context.getString(R.string.transcription_app_tap_to_try_again);
                case 2:
                    if (bVar.mo116703a() == 102) {
                        return context.getString(R.string.transcription_app_permission_error);
                    }
                    return context.getString(R.string.transcription_app_tap_to_try_again);
                case 3:
                    if (z) {
                        return context.getString(R.string.transcription_app_tap_to_try_again);
                    }
                    return context.getString(R.string.transcription_app_network_error);
                case 5:
                case 12:
                    return context.getString(R.string.transcription_app_network_error);
                case 7:
                    return context.getString(R.string.transcription_app_no_speech_detected_error);
                case 8:
                    return context.getString(R.string.transcription_app_tap_to_try_again);
                case 11:
                    if (!z) {
                        return context.getString(R.string.transcription_app_network_error);
                    }
                    if (bVar.mo116703a() == 2) {
                        return context.getString(R.string.transcription_app_tap_to_try_again);
                    }
                    return context.getString(R.string.transcription_app_voice_search_unavailable_error);
                case 13:
                    return context.getString(R.string.transcription_app_voice_search_unavailable_error);
                case 14:
                    return context.getString(R.string.transcription_app_voice_search_unavailable_error);
                default:
                    return context.getString(R.string.transcription_app_tap_to_try_again);
            }
        } else {
            throw null;
        }
    }
}
