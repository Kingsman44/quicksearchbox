package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124711i;
import com.google.android.p10712d.C142357ci;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.c */
/* compiled from: PG */
final class C95789c {
    /* renamed from: a */
    static C142360cl m158744a(int i, boolean z, C124711i iVar) {
        C142357ci ciVar = (C142357ci) C142360cl.f386303e.createBuilder();
        int i2 = i - 1;
        if (i2 == 1) {
            ciVar.mo117126a(C142359ck.VOLUME_UP_ONCE);
        } else if (i2 != 11) {
            if (i2 == 4) {
                ciVar.mo117126a(C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT);
                ciVar.mo117126a(C142359ck.TOGGLE_PLAY_PAUSE);
                ciVar.mo117126a(C142359ck.CALL_ANSWER);
                ciVar.mo117126a(C142359ck.CALL_HANGUP);
            } else if (i2 == 5) {
                if (iVar.equals(C124711i.BUTTON_ACTION_NEXT_TRACK)) {
                    ciVar.mo117126a(C142359ck.NEXT_TRACK);
                } else {
                    ciVar.mo117126a(C142359ck.FETCH_ANNOUNCEMENTS);
                    ciVar.mo117126a(C142359ck.EXPAND_ANNOUNCEMENT);
                    ciVar.mo117126a(C142359ck.STOP_ANNOUNCEMENTS);
                }
                ciVar.mo117126a(C142359ck.CANCEL_VOICE_INPUT);
            } else if (i2 != 6) {
                if (i2 == 7) {
                    ciVar.mo117126a(C142359ck.VOLUME_DOWN_ONCE);
                }
            } else if (z) {
                ciVar.mo117126a(C142359ck.PERFORM_VOICE_INPUT);
                ciVar.mo117126a(C142359ck.CALL_HANGUP);
                ciVar.mo117126a(C142359ck.CALL_REJECT);
            } else {
                ciVar.mo117126a(C142359ck.COMPLETE_VOICE_INPUT);
            }
        } else if (z) {
            ciVar.mo117126a(C142359ck.WILL_PAUSE);
            ciVar.mo117126a(C142359ck.PREPARE_FETCH);
        }
        if (((C142360cl) ciVar.instance).f386306b.size() == 0) {
            return null;
        }
        return (C142360cl) ciVar.build();
    }
}
