package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.apps.auto.p450a.p451a.C8898bp;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4552o.p4559e.C59743a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ai */
/* compiled from: PG */
public final class C11487ai {

    /* renamed from: a */
    private static final C59071e f37339a = C59071e.m91331h();

    /* renamed from: b */
    private final C38750am f37340b;

    public C11487ai(C38750am amVar) {
        this.f37340b = amVar;
    }

    /* renamed from: a */
    public final void mo20017a(C8898bp bpVar) {
        C59743a aVar;
        C69664n.m101061g(bpVar, "gearheadEventType");
        C8898bp bpVar2 = C8898bp.EVENT_TYPE_UNSPECIFIED;
        int ordinal = bpVar.ordinal();
        if (ordinal == 4) {
            aVar = C59743a.GEARHEAD_LONG_DRIVE_START;
        } else if (ordinal != 7) {
            switch (ordinal) {
                case 11:
                    aVar = C59743a.GEARHEAD_ASSISTANT_TOOLTIP_FOR_MEDIA_OPEN;
                    break;
                case 12:
                    aVar = C59743a.GEARHEAD_ASSISTANT_TOOLTIP_FOR_LAUNCHER_OPEN;
                    break;
                case 13:
                    aVar = C59743a.GEARHEAD_ASSISTANT_TOOLTIP_FOR_LONG_DRIVE_START;
                    break;
                case 14:
                    aVar = C59743a.GEARHEAD_ASSISTANT_MEDIA_REC_TOOLTIP_FOR_DRIVE_START;
                    break;
                case 15:
                    aVar = C59743a.GEARHEAD_ASSISTANT_MEDIA_REC_TOOLTIP_FOR_MEDIA_IDLE;
                    break;
                case 16:
                    aVar = C59743a.GEARHEAD_CUJ_SHORTCUTS_MEDIA_IMMERSIVE_CLICKED;
                    break;
                case 17:
                    aVar = C59743a.GEARHEAD_CUJ_SHORTCUTS_MEDIA_CLICKED;
                    break;
                case 18:
                    aVar = C59743a.GEARHEAD_CUJ_SHORTCUTS_CALL_CLICKED;
                    break;
                case 19:
                    aVar = C59743a.GEARHEAD_CUJ_SHORTCUTS_MESSAGING_CLICKED;
                    break;
                default:
                    C59052c cVar = (C59052c) f37339a.mo56226d();
                    int i = bpVar.f30896u;
                    cVar.mo56379ah(new C59094n(43354));
                    cVar.mo56387q("Untracked GearheadEvent %s", i);
                    aVar = null;
                    break;
            }
        } else {
            aVar = C59743a.GEARHEAD_ASSISTANT_TOOLTIP_FOR_FIRST_RUN;
        }
        if (aVar != null) {
            this.f37340b.mo41600l(aVar);
        }
    }
}
