package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.nga.shared.p6407v.C83317il;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82442fi;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82994ib;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.aq */
/* compiled from: PG */
public final class C82215aq implements C83314ii {

    /* renamed from: a */
    public final C83334w f224694a;

    /* renamed from: b */
    private final C83305i f224695b;

    /* renamed from: c */
    private final C22871g f224696c;

    public C82215aq(C83334w wVar, C83305i iVar, C22871g gVar) {
        this.f224694a = wVar;
        this.f224695b = iVar;
        this.f224696c = gVar;
    }

    /* renamed from: a */
    public final void mo75554a(int i) {
        mo75556c(i, 0, 1);
    }

    /* renamed from: b */
    public final void mo75555b(C82994ib ibVar) {
        this.f224696c.mo28212l("[NGA] logVisDelegationEvent", new C82213ao(this, ibVar));
    }

    /* renamed from: c */
    public final void mo75556c(int i, int i2, int i3) {
        this.f224696c.mo28212l("[NGA] logTriggeringEvent", new C82212an(this, i, i2, i3));
    }

    /* renamed from: d */
    public final void mo75557d(int i, int i2, String str) {
        this.f224696c.mo28212l("[NGA] logTriggeringEvent", new C82214ap(this, i, i2, str));
    }

    /* renamed from: e */
    public final void mo75558e(int i, int i2, int i3) {
        String str;
        C83305i iVar = this.f224695b;
        String str2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? "CANCELLED" : "FAILURE" : "SUCCESS" : "TRIGGERED";
        int a = C83317il.m132618a(i);
        switch (a) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "ASSIST_INTERACTION_SESSION_STARTER__START_SESSION";
                break;
            case 3:
                str = "NGA_REMOTE_VIS__SEND_VIS_EVENT_OR_FINISH";
                break;
            case 4:
                str = "NGA_REMOTE_VIS__ON_SHOW";
                break;
            case 5:
                str = "NGA_REMOTE_VIS__ON_CREATE";
                break;
            case 6:
                str = "NGA_VIS_ON_CREATE";
                break;
            case 7:
                str = "NGA_VIS_ON_SHOW";
                break;
            case 8:
                str = "NGA_VIS_SERVICE_ON_BIND";
                break;
            case 9:
                str = "NGA_VIS_SERVICE_START_IN_PROCESS_SESSION";
                break;
            case 10:
                str = "NGA_VIS_SERVICE_START_REMOTE_SESSION";
                break;
            case 11:
                str = "NGA_TRIGGER";
                break;
            case 12:
                str = "UI_SHOW_OBSERVER";
                break;
            case 13:
                str = "GSA_VIS_ON_CREATE";
                break;
            case 14:
                str = "GSA_VIS_ON_BIND";
                break;
            case 15:
                str = "GSA_VIS_ON_DESTROY";
                break;
            case 16:
                str = "GSA_VIS_ON_START_SESSION";
                break;
            default:
                str = "null";
                break;
        }
        if (a != 0) {
            String name = e.a(i2).name();
            if (name != null) {
                iVar.mo75579d(new C82442fi("NGA_TRIGGERING", str, name, str2));
                return;
            }
            throw new NullPointerException("Null triggerType");
        }
        throw null;
    }
}
