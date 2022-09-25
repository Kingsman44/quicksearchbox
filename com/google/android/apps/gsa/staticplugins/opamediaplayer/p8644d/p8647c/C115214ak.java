package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3897e.p3921j.C52577wx;
import com.google.assistant.p3897e.p3921j.C52579wz;
import com.google.assistant.p3897e.p3921j.C52583xc;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68120m;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68121n;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68122o;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68126s;
import p5285d.p5286a.p5287a.p5288a.p5289a.C68127t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ak */
/* compiled from: PG */
public final class C115214ak implements C115211ah {

    /* renamed from: a */
    public static final C59071e f319741a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ak");

    /* renamed from: b */
    public final C89859i f319742b;

    /* renamed from: c */
    public final int f319743c;

    /* renamed from: d */
    private final C60870cx f319744d;

    public C115214ak(C60870cx cxVar, C89859i iVar, int i) {
        this.f319744d = cxVar;
        this.f319743c = i;
        this.f319742b = iVar;
    }

    /* renamed from: f */
    private final void m191015f(String str, C68121n nVar, C52577wx wxVar) {
        if (wxVar.equals(C52577wx.READ_IT_LATER)) {
            this.f319742b.mo83702b(C89849ae.SPEAKR_READ_STATE_UPDATE_REQUESTED);
            C68126s sVar = (C68126s) C68127t.f184386c.createBuilder();
            sVar.copyOnWrite();
            str.getClass();
            ((C68127t) sVar.instance).f184388a = str;
            sVar.copyOnWrite();
            nVar.getClass();
            ((C68127t) sVar.instance).f184389b = nVar;
            C60856cj.m92911t(this.f319744d, new C115212ai(this, (C68127t) sVar.build(), new C115213aj(this, str, nVar)), C60826bg.f164896a);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo101893a(C52174hz hzVar) {
    }

    /* renamed from: b */
    public final void mo101894b(C52174hz hzVar) {
        C52583xc xcVar;
        C68122o oVar;
        C52583xc xcVar2;
        if ((hzVar.f136894a & 1) != 0) {
            String str = hzVar.f136895b;
            C52568wo woVar = hzVar.f136897d;
            if (woVar == null) {
                woVar = C52568wo.f137992v;
            }
            if (woVar.f137996c == 26) {
                xcVar = (C52583xc) woVar.f137997d;
            } else {
                xcVar = C52583xc.f138063o;
            }
            C68120m mVar = (C68120m) C68121n.f184372c.createBuilder();
            int i = xcVar.f138067c;
            mVar.copyOnWrite();
            ((C68121n) mVar.instance).f184374a = i;
            C52579wz a = C52579wz.m86656a(xcVar.f138066b);
            if (a == null) {
                a = C52579wz.UNKNOWN_READ_STATE;
            }
            int ordinal = a.ordinal();
            if (ordinal == 0) {
                oVar = C68122o.SPEAKR_ITEM_STATE_UNKNOWN;
            } else if (ordinal == 1) {
                oVar = C68122o.SPEAKR_ITEM_STATE_FULLY_READ;
            } else if (ordinal == 2) {
                oVar = C68122o.SPEAKR_ITEM_STATE_UNREAD;
            } else if (ordinal == 3) {
                oVar = C68122o.SPEAKR_ITEM_STATE_PARTIALLY_READ;
            } else if (ordinal != 4) {
                oVar = C68122o.SPEAKR_ITEM_STATE_UNKNOWN;
            } else {
                oVar = C68122o.SPEAKR_ITEM_STATE_ARCHIVED;
            }
            mVar.copyOnWrite();
            ((C68121n) mVar.instance).f184375b = oVar.getNumber();
            C68121n nVar = (C68121n) mVar.build();
            C52568wo woVar2 = hzVar.f136897d;
            if (woVar2 == null) {
                woVar2 = C52568wo.f137992v;
            }
            if (woVar2.f137996c == 26) {
                xcVar2 = (C52583xc) woVar2.f137997d;
            } else {
                xcVar2 = C52583xc.f138063o;
            }
            C52577wx a2 = C52577wx.m86654a(xcVar2.f138069e);
            if (a2 == null) {
                a2 = C52577wx.UNKNOWN_PLAYBACK_TYPE;
            }
            m191015f(str, nVar, a2);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101895c(C52176ia iaVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo101896d(C84275o oVar) {
    }

    /* renamed from: e */
    public final void mo101898e(String str, C52577wx wxVar) {
        C68120m mVar = (C68120m) C68121n.f184372c.createBuilder();
        C68122o oVar = C68122o.SPEAKR_ITEM_STATE_ARCHIVED;
        mVar.copyOnWrite();
        ((C68121n) mVar.instance).f184375b = oVar.getNumber();
        m191015f(str, (C68121n) mVar.build(), wxVar);
    }
}
