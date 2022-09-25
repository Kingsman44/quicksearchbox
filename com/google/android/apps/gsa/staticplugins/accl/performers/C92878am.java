package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52229k;
import com.google.assistant.p3897e.p3921j.C52283m;
import com.google.assistant.p3897e.p3921j.C52337o;
import com.google.assistant.p3897e.p3921j.C52391q;
import com.google.assistant.p3897e.p3921j.C52445s;
import com.google.assistant.p3897e.p3921j.acv;
import com.google.assistant.p3897e.p3921j.acw;
import com.google.assistant.p3897e.p3921j.acx;
import com.google.assistant.p3897e.p3921j.acy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.am */
/* compiled from: PG */
public final class C92878am extends C22538o {

    /* renamed from: a */
    public static final C59071e f259122a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.am");

    /* renamed from: b */
    public final Context f259123b;

    /* renamed from: c */
    public final C58833ax f259124c;

    /* renamed from: d */
    public final C58833ax f259125d;

    /* renamed from: e */
    private final C85476b f259126e;

    public C92878am(Context context, C85476b bVar, C58833ax axVar, C58833ax axVar2) {
        this.f259123b = context;
        this.f259126e = bVar;
        this.f259124c = axVar;
        this.f259125d = axVar2;
    }

    /* renamed from: c */
    static final acy m152929c(C52337o oVar) {
        acv acv = (acv) acy.f134860d.createBuilder();
        String str = oVar.f137366a;
        acv.copyOnWrite();
        acy acy = (acy) acv.instance;
        str.getClass();
        acy.f134862a |= 1;
        acy.f134863b = str;
        acw acw = (acw) acx.f134854e.createBuilder();
        C52283m mVar = oVar.f137367b;
        if (mVar == null) {
            mVar = C52283m.f137246d;
        }
        String str2 = mVar.f137249b;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        str2.getClass();
        acx.f134856a |= 8;
        acx.f134858c = str2;
        C52283m mVar2 = oVar.f137367b;
        if (mVar2 == null) {
            mVar2 = C52283m.f137246d;
        }
        String str3 = mVar2.f137250c;
        acw.copyOnWrite();
        acx acx2 = (acx) acw.instance;
        str3.getClass();
        acx2.f134856a |= 16;
        acx2.f134859d = str3;
        C52283m mVar3 = oVar.f137367b;
        if (mVar3 == null) {
            mVar3 = C52283m.f137246d;
        }
        String str4 = mVar3.f137248a;
        acw.copyOnWrite();
        acx acx3 = (acx) acw.instance;
        str4.getClass();
        acx3.f134856a |= 4;
        acx3.f134857b = str4;
        acx acx4 = (acx) acw.build();
        acv.copyOnWrite();
        acy acy2 = (acy) acv.instance;
        acx4.getClass();
        acy2.f134864c = acx4;
        acy2.f134862a |= 2;
        return (acy) acv.build();
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C52391q qVar;
        C52445s sVar;
        String str = dyVar.f135936b;
        int i = 0;
        if (((str.hashCode() == 295762330 && str.equals("amp.OPEN_AMP_ACTIONS_VIEWER")) ? (char) 0 : 65535) == 0) {
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C52229k kVar = (C52229k) m41992m(dwVar, "amp_actions_viewer_args", C52229k.f137053c.getParserForType());
                int i2 = kVar.f137055a;
                if (i2 == 0) {
                    i = 3;
                } else if (i2 == 1) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                }
                int i3 = i - 1;
                if (i != 0) {
                    if (i3 == 0) {
                        if (i2 == 1) {
                            qVar = (C52391q) kVar.f137056b;
                        } else {
                            qVar = C52391q.f137475b;
                        }
                        C52337o oVar = qVar.f137477a;
                        if (oVar == null) {
                            oVar = C52337o.f137364c;
                        }
                        mo87476b(m152929c(oVar));
                    } else if (i3 == 1) {
                        if (i2 == 2) {
                            sVar = (C52445s) kVar.f137056b;
                        } else {
                            sVar = C52445s.f137665b;
                        }
                        C62971cq<C52337o> cqVar = sVar.f137667a;
                        ArrayList arrayList = new ArrayList();
                        for (C52337o c : cqVar) {
                            arrayList.add(m152929c(c));
                        }
                        this.f259126e.mo78995a(arrayList);
                    } else if (i3 != 2) {
                        C51807dw dwVar2 = dyVar.f135938d;
                        if (dwVar2 == null) {
                            dwVar2 = C51807dw.f135930b;
                        }
                        mo87476b((acy) m41992m(dwVar2, "open_amp_actions_viewer_args", acy.f134860d.getParserForType()));
                    } else {
                        throw new C22428d(dyVar);
                    }
                    return f62144n;
                }
                throw null;
            } catch (C22371a unused) {
            }
        } else {
            throw new C22428d(dyVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo87476b(acy acy) {
        this.f259126e.mo78996c(acy, new C92877al(this));
    }
}
