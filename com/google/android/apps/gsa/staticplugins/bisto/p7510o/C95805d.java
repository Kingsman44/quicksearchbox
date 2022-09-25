package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.p10712d.C142357ci;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.d */
/* compiled from: PG */
final class C95805d {
    /* renamed from: a */
    static C142360cl m158800a(int i, boolean z) {
        C142357ci ciVar = (C142357ci) C142360cl.f386303e.createBuilder();
        int i2 = i - 1;
        if (i2 == 4) {
            ciVar.mo117126a(C142359ck.TOGGLE_PLAY_PAUSE);
            ciVar.mo117126a(C142359ck.CALL_ANSWER);
            ciVar.mo117126a(C142359ck.CALL_HANGUP);
        } else if (i2 == 5) {
            ciVar.mo117126a(C142359ck.NEXT_TRACK);
            ciVar.mo117126a(C142359ck.SKIP_CURRENT_ANNOUNCEMENT);
        } else if (i2 != 6) {
            if (i2 != 11) {
                switch (i2) {
                    case 13:
                        ciVar.mo117126a(C142359ck.FETCH_ANNOUNCEMENTS);
                        ciVar.mo117126a(C142359ck.EXPAND_ANNOUNCEMENT);
                        ciVar.mo117126a(C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT);
                        break;
                    case 14:
                        ciVar.mo117126a(C142359ck.STOP_ANNOUNCEMENTS);
                        ciVar.mo117126a(C142359ck.CANCEL_VOICE_INPUT);
                        break;
                    case 15:
                        ciVar.mo117126a(z ? C142359ck.PERFORM_VOICE_INPUT : C142359ck.COMPLETE_VOICE_INPUT);
                        break;
                    case 16:
                        if (z) {
                            ciVar.mo117126a(C142359ck.WILL_PAUSE);
                            ciVar.mo117126a(C142359ck.PREPARE_FETCH);
                            ciVar.mo117126a(C142359ck.PREPARE_VOICE_INPUT);
                            break;
                        }
                        break;
                }
            } else if (z) {
                ciVar.mo117126a(C142359ck.WILL_PAUSE);
            }
        } else if (z) {
            ciVar.mo117126a(C142359ck.CALL_HANGUP);
            ciVar.mo117126a(C142359ck.CALL_REJECT);
            ciVar.mo117126a(C142359ck.HFP_VOICE_ACTIVATION);
        }
        if (((C142360cl) ciVar.instance).f386306b.size() == 0) {
            return null;
        }
        return (C142360cl) ciVar.build();
    }
}
