package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7525am;
import com.google.p375ai.p378b.C7526an;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.f */
/* compiled from: PG */
public final class C91987f {
    /* renamed from: a */
    public static int m150963a(C7526an anVar) {
        if ((anVar.f26051a & 32) != 0) {
            int i = anVar.f26057g;
            int a = C7525am.m22776a(i);
            if (a == 0) {
                return R.drawable.quantum_ic_arrow_forward_white_24;
            }
            switch (a) {
                case 1:
                    return R.drawable.quantum_ic_arrow_forward_white_24;
                case 2:
                    return R.drawable.ic_email;
                case 3:
                    return R.drawable.ic_navigation;
                case 4:
                    return R.drawable.quantum_ic_call_white_24;
                case 5:
                    return R.drawable.ic_directions;
                case 7:
                    return R.drawable.ic_video_youtube;
                case 8:
                    return R.drawable.ic_playstore;
                case 9:
                    return R.drawable.quantum_ic_search_white_24;
                case 10:
                    return R.drawable.ic_place;
                case 12:
                    return R.drawable.quantum_ic_settings_white_24;
                case 13:
                    return R.drawable.quantum_ic_notifications_off_grey600_24;
                case 14:
                    return R.drawable.quantum_ic_play_arrow_black_24;
                case 15:
                    return R.drawable.quantum_ic_feedback_white_24;
                case 16:
                    return R.drawable.quantum_ic_thumb_up_white_24;
                case 17:
                    return R.drawable.quantum_ic_thumb_down_white_24;
                default:
                    int a2 = C7525am.m22776a(i);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    throw new C91963an(a2);
            }
        } else {
            throw new C91963an();
        }
    }
}
