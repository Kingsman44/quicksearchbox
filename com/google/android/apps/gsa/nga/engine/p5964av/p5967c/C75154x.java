package com.google.android.apps.gsa.nga.engine.p5964av.p5967c;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.x */
/* compiled from: PG */
public final class C75154x {

    /* renamed from: a */
    public final C79863k f209572a;

    public C75154x(C79863k kVar) {
        this.f209572a = kVar;
    }

    /* renamed from: a */
    public static C89849ae m121423a(e eVar) {
        C83016y yVar = C83016y.UNKNOWN;
        e eVar2 = e.a;
        switch (eVar.ordinal()) {
            case 5:
                return C89849ae.NGA_EXPLICIT_TRIGGER_OPA_REQUEST;
            case 26:
                return C89849ae.NGA_EXPLICIT_TRIGGER_PROACTIVE;
            case 64:
            case 76:
            case 118:
                return C89849ae.NGA_EXPLICIT_TRIGGER_SQUEEZE;
            case 74:
                return C89849ae.NGA_EXPLICIT_TRIGGER_DEEPLINK;
            case 75:
                return C89849ae.NGA_EXPLICIT_TRIGGER_SWIPE;
            case 98:
                return C89849ae.NGA_EXPLICIT_TRIGGER_HOTWORD;
            case 100:
                return C89849ae.NGA_EXPLICIT_TRIGGER_USER_REQUEST;
            case 109:
                return C89849ae.NGA_EXPLICIT_TRIGGER_PUSH_TO_TALK;
            case 111:
                return C89849ae.NGA_EXPLICIT_TRIGGER_WATCH;
            case 122:
                return C89849ae.NGA_EXPLICIT_TRIGGER_LOCKSCREEN_HOTWORD;
            case 124:
                return C89849ae.NGA_EXPLICIT_TRIGGER_LPH;
            case 128:
                return C89849ae.NGA_EXPLICIT_TRIGGER_MIC_TAP;
            default:
                return C89849ae.NGA_EXPLICIT_TRIGGER_UNKNOWN;
        }
    }
}
