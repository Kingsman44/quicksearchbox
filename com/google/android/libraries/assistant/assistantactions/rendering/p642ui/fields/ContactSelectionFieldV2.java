package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90930c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11268e;
import com.google.android.libraries.assistant.assistantactions.p633d.C11269f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11314b;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.assistant.p3897e.p3902c.p3907c.C50964bi;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50968bm;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionFieldV2 */
/* compiled from: PG */
public class ContactSelectionFieldV2 extends C11407n implements C11314b {

    /* renamed from: a */
    public static final C59071e f36962a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionFieldV2");

    /* renamed from: b */
    private LinearLayout f36963b;

    /* renamed from: c */
    private ListView f36964c;

    /* renamed from: d */
    private RelativeLayout f36965d;

    /* renamed from: e */
    private TextView f36966e;

    /* renamed from: f */
    private LinearLayout f36967f;

    /* renamed from: g */
    private int f36968g = 1;

    public ContactSelectionFieldV2(Context context) {
        super(context);
    }

    /* renamed from: f */
    private final void m27018f(View view, C50969bn bnVar) {
        if ((bnVar.f132680a & 8) != 0) {
            view.setOnClickListener(new C11347ag(this));
        } else {
            view.setOnClickListener(new C11346af(this));
        }
    }

    /* renamed from: r */
    private final void m27019r(C50969bn bnVar) {
        alf alf;
        C50965bj bjVar = bnVar.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        int a = C50964bi.m85996a(bjVar.f132675d);
        if (a != 0 && a == 3) {
            C50965bj bjVar2 = bnVar.f132682c;
            if ((bjVar2 == null ? C50965bj.f132670e : bjVar2).f132673b == 2) {
                TextView textView = this.f36966e;
                if (bjVar2 == null) {
                    bjVar2 = C50965bj.f132670e;
                }
                if (bjVar2.f132673b == 2) {
                    alf = (alf) bjVar2.f132674c;
                } else {
                    alf = alf.f135314d;
                }
                textView.setText(alf.f135317b);
            }
        }
        this.f36965d.setVisibility(0);
        m27018f(this.f36965d, bnVar);
    }

    /* renamed from: s */
    private final void m27020s(C50969bn bnVar, boolean z, boolean z2) {
        C51030du duVar = bnVar.f132683d;
        if (duVar == null) {
            duVar = C51030du.f132868g;
        }
        if (!duVar.f132875f.isEmpty()) {
            Context context = getContext();
            C51030du duVar2 = bnVar.f132683d;
            C62971cq cqVar = (duVar2 == null ? C51030du.f132868g : duVar2).f132875f;
            if (duVar2 == null) {
                duVar2 = C51030du.f132868g;
            }
            this.f36964c.setAdapter(new C11349ai(this, context, (C51027dr[]) cqVar.toArray(new C51027dr[duVar2.f132875f.size()]), z, z2));
            this.f36964c.setVisibility(0);
            this.f36964c.setOnItemClickListener(new C11345ae(this));
        }
    }

    /* renamed from: t */
    private final void m27021t() {
        this.f36967f.setVisibility(0);
        this.f36967f.setOnClickListener(new C11347ag(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m27022u(com.google.assistant.p3897e.p3902c.p3907c.C50969bn r12) {
        /*
            r11 = this;
            com.google.assistant.e.c.c.bj r0 = r12.f132682c
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.c.c.bj r0 = com.google.assistant.p3897e.p3902c.p3907c.C50965bj.f132670e
        L_0x0006:
            int r1 = r0.f132673b
            r2 = 3
            if (r1 != r2) goto L_0x0010
            java.lang.Object r0 = r0.f132674c
            com.google.assistant.e.c.c.hx r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r0
            goto L_0x0012
        L_0x0010:
            com.google.assistant.e.c.c.hx r0 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x0012:
            android.widget.LinearLayout r1 = r11.f36963b
            r2 = 2131429947(0x7f0b0a3b, float:1.8481581E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r1
            android.widget.LinearLayout r2 = r11.f36963b
            r3 = 2131429948(0x7f0b0a3c, float:1.8481583E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.widget.LinearLayout r3 = r11.f36963b
            r4 = 2131429946(0x7f0b0a3a, float:1.848158E38)
            android.view.View r3 = r3.findViewById(r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 0
            r1.setVisibility(r4)
            int r5 = r0.f133122b
            r6 = 1
            if (r5 != r6) goto L_0x005b
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r5 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r7 = r11.getContext()
            int r8 = r0.f133122b
            java.lang.String r9 = ""
            if (r8 != r6) goto L_0x004f
            java.lang.Object r8 = r0.f133123c
            java.lang.String r8 = (java.lang.String) r8
            r10 = r8
            r8 = 1
            goto L_0x0050
        L_0x004f:
            r10 = r9
        L_0x0050:
            if (r8 != r6) goto L_0x0057
            java.lang.Object r8 = r0.f133123c
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
        L_0x0057:
            r5.<init>(r7, r10, r9)
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            r1.f36858e = r6
            com.google.assistant.e.c.c.dc r7 = r0.f133126f
            if (r7 != 0) goto L_0x0064
            com.google.assistant.e.c.c.dc r7 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0064:
            r1.mo19786b(r7, r5)
            int r1 = r0.f133122b
            if (r1 != r6) goto L_0x0075
            java.lang.Object r1 = r0.f133123c
            java.lang.String r1 = (java.lang.String) r1
            r2.setText(r1)
            r2.setVisibility(r4)
        L_0x0075:
            int r1 = r0.f133121a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = r0.f133124d
            r3.setText(r0)
            r3.setVisibility(r4)
        L_0x0083:
            android.widget.LinearLayout r0 = r11.f36963b
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r11.f36963b
            r11.m27018f(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ContactSelectionFieldV2.m27022u(com.google.assistant.e.c.c.bn):void");
    }

    /* renamed from: a */
    public final void mo19836a(C52479tg tgVar) {
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = this.f37153l.f36729a.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = this.f37153l.f36729a.f136280h;
            tpVar.copyOnWrite();
            C52490tr trVar2 = (C52490tr) tpVar.instance;
            str2.getClass();
            trVar2.f137797a |= 2;
            trVar2.f137801e = str2;
            tpVar.copyOnWrite();
            C52490tr trVar3 = (C52490tr) tpVar.instance;
            trVar3.f137797a |= 4;
            trVar3.f137802f = true;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            tgVar.getClass();
            trVar4.f137799c = tgVar;
            trVar4.f137798b = 8;
            cVar.f36730b = (C52490tr) tpVar.build();
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50969bn bnVar;
        this.f36965d.setVisibility(8);
        this.f36964c.setVisibility(8);
        this.f36967f.setVisibility(8);
        this.f36963b.setVisibility(8);
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            C50965bj bjVar = bnVar.f132682c;
            if (bjVar == null) {
                bjVar = C50965bj.f132670e;
            }
            if ((bjVar.f132672a & 1) != 0) {
                C50965bj bjVar2 = bnVar.f132682c;
                if (bjVar2 == null) {
                    bjVar2 = C50965bj.f132670e;
                }
                int a = C50964bi.m85996a(bjVar2.f132675d);
                if (a == 0) {
                    a = 1;
                }
                switch (a - 1) {
                    case 1:
                        mo19837d(4);
                        C51030du duVar = bnVar.f132683d;
                        if (duVar == null) {
                            duVar = C51030du.f132868g;
                        }
                        if (duVar.f132875f.size() > 0) {
                            m27020s(bnVar, true, false);
                            if ((bnVar.f132680a & 8) != 0) {
                                m27021t();
                                return;
                            }
                            return;
                        }
                        m27019r(bnVar);
                        return;
                    case 2:
                        mo19837d(15);
                        m27019r(bnVar);
                        return;
                    case 3:
                    case 4:
                        mo19837d(7);
                        C50965bj bjVar3 = bnVar.f132682c;
                        if (bjVar3 == null) {
                            bjVar3 = C50965bj.f132670e;
                        }
                        if (bjVar3.f132673b == 3) {
                            m27022u(bnVar);
                            return;
                        }
                        return;
                    case 5:
                        mo19837d(4);
                        m27020s(bnVar, true, false);
                        if ((bnVar.f132680a & 8) != 0) {
                            m27021t();
                            return;
                        }
                        return;
                    case 6:
                        mo19837d(11);
                        C50965bj bjVar4 = bnVar.f132682c;
                        if (bjVar4 == null) {
                            bjVar4 = C50965bj.f132670e;
                        }
                        if (bjVar4.f132673b == 3) {
                            m27022u(bnVar);
                        }
                        m27020s(bnVar, false, true);
                        if ((bnVar.f132680a & 8) != 0) {
                            m27021t();
                            return;
                        }
                        return;
                    case 7:
                        mo19837d(13);
                        m27020s(bnVar, false, false);
                        return;
                    default:
                        ((C59052c) ((C59052c) f36962a.mo56225c()).mo56372aa(43245)).mo56386p("Unsupported contact selection header UI mode.");
                        return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo19747c(Intent intent, C22694ag agVar) {
        C11301i iVar = this.f37152k;
        if (iVar != null) {
            iVar.mo19718a(intent, agVar);
        }
    }

    /* renamed from: d */
    public final void mo19837d(int i) {
        if (this.f37157p != null) {
            C11268e d = C11269f.m26752d();
            d.mo19678c(i);
            C11054a aVar = this.f37155n;
            if (aVar != null) {
                d.mo19677b(aVar.mo19521b(6));
            }
            this.f37157p.mo19675a(d.mo19676a());
        }
    }

    /* renamed from: e */
    public final void mo19748e(long j) {
        mo19837d(5);
        C11301i iVar = this.f37152k;
        if (iVar != null) {
            C60856cj.m92911t(iVar.mo19730m(j, this.f36968g), new C11348ah(this), new C90930c());
        }
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        C51941eu euVar;
        this.f37153l = cVar;
        C11295c cVar2 = this.f37153l;
        if (!(cVar2 == null || (euVar = cVar2.f36729a) == null || euVar.f136277e != 16)) {
            C50969bn bnVar = (C50969bn) euVar.f136278f;
            if ((bnVar.f132680a & 64) != 0) {
                int a = C50968bm.m85997a(bnVar.f132687h);
                if (a == 0) {
                    a = 1;
                }
                this.f36968g = a;
            }
        }
        mo19809b();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36964c = (ListView) findViewById(R.id.contact_disambiguation_v2);
        this.f36965d = (RelativeLayout) findViewById(R.id.contact_selection_v2);
        this.f36966e = (TextView) findViewById(R.id.contact_selection_v2_text);
        this.f36967f = (LinearLayout) findViewById(R.id.pick_another_contact);
        this.f36963b = (LinearLayout) findViewById(R.id.contact_selected_item_v2);
    }

    public ContactSelectionFieldV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactSelectionFieldV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContactSelectionFieldV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
