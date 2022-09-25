package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90930c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11268e;
import com.google.android.libraries.assistant.assistantactions.p633d.C11269f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11314b;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50964bi;
import com.google.assistant.p3897e.p3902c.p3907c.C50965bj;
import com.google.assistant.p3897e.p3902c.p3907c.C50968bm;
import com.google.assistant.p3897e.p3902c.p3907c.C50969bn;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52478tf;
import com.google.assistant.p3897e.p3921j.C52479tg;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52493tu;
import com.google.assistant.p3897e.p3921j.C52494tv;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField */
/* compiled from: PG */
public class ContactSelectionField extends C11407n implements C11314b {

    /* renamed from: a */
    public static final C59071e f36949a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ContactSelectionField");

    /* renamed from: b */
    private TextView f36950b;

    /* renamed from: c */
    private TextView f36951c;

    /* renamed from: d */
    private TextView f36952d;

    /* renamed from: e */
    private LinearLayout f36953e;

    /* renamed from: f */
    private ListView f36954f;

    /* renamed from: g */
    private ListView f36955g;

    /* renamed from: h */
    private LinearLayout f36956h;

    /* renamed from: i */
    private LinearLayout f36957i;

    /* renamed from: t */
    private TextView f36958t;

    /* renamed from: u */
    private GridView f36959u;

    /* renamed from: v */
    private RecyclerView f36960v;

    /* renamed from: w */
    private int f36961w = 1;

    public ContactSelectionField(Context context) {
        super(context);
    }

    /* renamed from: t */
    private final void m27004t(View view, C50969bn bnVar) {
        if ((bnVar.f132680a & 8) != 0) {
            view.setOnClickListener(new C11417x(this));
        } else {
            view.setOnClickListener(new C11415v(this));
        }
    }

    /* renamed from: u */
    private final void m27005u(C50969bn bnVar) {
        alf alf;
        C50965bj bjVar = bnVar.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        if (bjVar.f132673b == 2) {
            TextView textView = this.f36951c;
            C50965bj bjVar2 = bnVar.f132682c;
            if (bjVar2 == null) {
                bjVar2 = C50965bj.f132670e;
            }
            if (bjVar2.f132673b == 2) {
                alf = (alf) bjVar2.f132674c;
            } else {
                alf = alf.f135314d;
            }
            textView.setText(alf.f135317b);
            this.f36956h.setVisibility(0);
            m27004t(this.f36956h, bnVar);
        }
    }

    /* renamed from: v */
    private final void m27006v(C50969bn bnVar, boolean z) {
        C51027dr[] drVarArr;
        C11054a aVar = this.f37155n;
        boolean z2 = aVar != null && aVar.mo19521b(6);
        C11054a aVar2 = this.f37155n;
        if ((aVar2 == null || !aVar2.mo19521b(7)) && !z2) {
            m27007w(bnVar, z, true);
            return;
        }
        C51030du duVar = bnVar.f132683d;
        if (duVar == null) {
            duVar = C51030du.f132868g;
        }
        C62971cq cqVar = duVar.f132875f;
        if (!cqVar.isEmpty()) {
            if (z) {
                drVarArr = (C51027dr[]) cqVar.toArray(new C51027dr[(cqVar.size() + 1)]);
            } else {
                drVarArr = (C51027dr[]) cqVar.toArray(new C51027dr[cqVar.size()]);
            }
            C11343ac acVar = new C11343ac(this, getContext(), drVarArr, bnVar, z);
            int length = drVarArr.length;
            if (length > 3) {
                this.f36959u.setNumColumns(4);
            } else {
                this.f36959u.setNumColumns(length);
            }
            this.f36959u.setAdapter(acVar);
            this.f36959u.setVisibility(0);
            this.f36959u.setOnItemClickListener(new C11341aa(this, drVarArr, z));
        }
    }

    /* renamed from: w */
    private final void m27007w(C50969bn bnVar, boolean z, boolean z2) {
        C50965bj bjVar = bnVar.f132682c;
        if (bjVar == null) {
            bjVar = C50965bj.f132670e;
        }
        if (bjVar.f132673b == 3) {
            m27008x(bnVar);
        }
        C51030du duVar = bnVar.f132683d;
        if (duVar == null) {
            duVar = C51030du.f132868g;
        }
        C62971cq cqVar = duVar.f132875f;
        if (!cqVar.isEmpty()) {
            this.f36954f.setAdapter(new C11344ad(this, getContext(), (C51027dr[]) cqVar.toArray(new C51027dr[cqVar.size()]), z2));
            this.f36954f.setVisibility(0);
            this.f36954f.setOnItemClickListener(new C11416w(this));
        }
        if (z) {
            C50936ah ahVar = bnVar.f132684e;
            if (ahVar == null) {
                ahVar = C50936ah.f132593m;
            }
            ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
            buttonComponent.mo19768a(ahVar, false, false);
            buttonComponent.setBackgroundResource(0);
            this.f36957i.addView(buttonComponent);
            this.f36957i.setVisibility(0);
            this.f36957i.setOnClickListener(new C11417x(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m27008x(com.google.assistant.p3897e.p3902c.p3907c.C50969bn r10) {
        /*
            r9 = this;
            com.google.assistant.e.c.c.bj r0 = r10.f132682c
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
            android.widget.LinearLayout r1 = r9.f36953e
            r2 = 2131429942(0x7f0b0a36, float:1.848157E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r1
            r2 = 0
            r1.setVisibility(r2)
            int r3 = r0.f133122b
            r4 = 1
            if (r3 != r4) goto L_0x0045
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r3 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r5 = r9.getContext()
            int r6 = r0.f133122b
            java.lang.String r7 = ""
            if (r6 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f133123c
            java.lang.String r6 = (java.lang.String) r6
            r8 = r6
            r6 = 1
            goto L_0x003a
        L_0x0039:
            r8 = r7
        L_0x003a:
            if (r6 != r4) goto L_0x0041
            java.lang.Object r6 = r0.f133123c
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
        L_0x0041:
            r3.<init>(r5, r8, r7)
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            com.google.assistant.e.c.c.dc r5 = r0.f133126f
            if (r5 != 0) goto L_0x004c
            com.google.assistant.e.c.c.dc r5 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x004c:
            r1.mo19786b(r5, r3)
            int r1 = r0.f133122b
            if (r1 != r4) goto L_0x0061
            android.widget.TextView r1 = r9.f36952d
            java.lang.Object r3 = r0.f133123c
            java.lang.String r3 = (java.lang.String) r3
            r1.setText(r3)
            android.widget.TextView r1 = r9.f36952d
            r1.setVisibility(r2)
        L_0x0061:
            int r1 = r0.f133121a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0073
            android.widget.TextView r1 = r9.f36958t
            java.lang.String r0 = r0.f133124d
            r1.setText(r0)
            android.widget.TextView r0 = r9.f36958t
            r0.setVisibility(r2)
        L_0x0073:
            android.widget.LinearLayout r0 = r9.f36953e
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r9.f36953e
            r9.m27004t(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ContactSelectionField.m27008x(com.google.assistant.e.c.c.bn):void");
    }

    /* renamed from: a */
    public final void mo19830a(int i) {
        C50969bn bnVar;
        C51016dg dgVar;
        if (this.f37153l != null && this.f37154m != null) {
            C52478tf tfVar = (C52478tf) C52479tg.f137757d.createBuilder();
            C52493tu tuVar = (C52493tu) C52494tv.f137809c.createBuilder();
            tuVar.copyOnWrite();
            C52494tv tvVar = (C52494tv) tuVar.instance;
            tvVar.f137811a |= 1;
            tvVar.f137812b = (long) i;
            tfVar.copyOnWrite();
            C52479tg tgVar = (C52479tg) tfVar.instance;
            C52494tv tvVar2 = (C52494tv) tuVar.build();
            tvVar2.getClass();
            tgVar.f137761c = tvVar2;
            tgVar.f137759a |= 2;
            mo19834r((C52479tg) tfVar.build());
            C11298f a = this.f37154m.mo19691a(this.f37153l);
            C51941eu euVar = this.f37153l.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            C51030du duVar = bnVar.f132683d;
            if (duVar == null) {
                duVar = C51030du.f132868g;
            }
            C62971cq cqVar = duVar.f132875f;
            if (i >= cqVar.size() || ((C51027dr) cqVar.get(i)).f132857d != 4) {
                mo19941h(a);
                return;
            }
            C51027dr drVar = (C51027dr) cqVar.get(i);
            if (drVar.f132857d == 4) {
                dgVar = (C51016dg) drVar.f132858e;
            } else {
                dgVar = C51016dg.f132827g;
            }
            mo19942i(dgVar, a);
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50969bn bnVar;
        this.f36956h.setVisibility(8);
        this.f36954f.setVisibility(8);
        this.f36955g.setVisibility(8);
        this.f36959u.setVisibility(8);
        this.f36960v.setVisibility(8);
        this.f36957i.setVisibility(8);
        this.f36957i.removeAllViews();
        this.f36953e.setVisibility(8);
        this.f36952d.setVisibility(8);
        this.f36958t.setVisibility(8);
        if (this.f37153l != null) {
            C11054a aVar = this.f37155n;
            boolean z = true;
            boolean z2 = aVar != null && aVar.mo19521b(6);
            C11054a aVar2 = this.f37155n;
            boolean z3 = aVar2 != null && aVar2.mo19521b(7);
            C51941eu euVar = this.f37153l.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            if ((bnVar.f132680a & 1) != 0) {
                this.f36950b.setText(bnVar.f132681b);
                this.f36950b.setVisibility(0);
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
                        mo19835s(4);
                        C51030du duVar = bnVar.f132683d;
                        if (duVar == null) {
                            duVar = C51030du.f132868g;
                        }
                        if (duVar.f132875f.size() > 0) {
                            if ((bnVar.f132680a & 8) == 0) {
                                z = false;
                            }
                            m27006v(bnVar, z);
                            return;
                        }
                        m27005u(bnVar);
                        return;
                    case 2:
                        mo19835s(15);
                        m27005u(bnVar);
                        return;
                    case 3:
                    case 4:
                        mo19835s(7);
                        C50965bj bjVar3 = bnVar.f132682c;
                        if (bjVar3 == null) {
                            bjVar3 = C50965bj.f132670e;
                        }
                        if (bjVar3.f132673b == 3) {
                            m27008x(bnVar);
                        }
                        this.f36956h.setOnClickListener(new C11417x(this));
                        return;
                    case 5:
                        mo19835s(4);
                        if ((bnVar.f132680a & 8) == 0) {
                            z = false;
                        }
                        m27006v(bnVar, z);
                        return;
                    case 6:
                        mo19835s(11);
                        if (z3 || z2) {
                            C50965bj bjVar4 = bnVar.f132682c;
                            if (bjVar4 == null) {
                                bjVar4 = C50965bj.f132670e;
                            }
                            if (bjVar4.f132673b == 3) {
                                m27008x(bnVar);
                            }
                            C51030du duVar2 = bnVar.f132683d;
                            if (duVar2 == null) {
                                duVar2 = C51030du.f132868g;
                            }
                            C62971cq cqVar = duVar2.f132875f;
                            if (!cqVar.isEmpty()) {
                                this.f36955g.setAdapter(new C11342ab(this, getContext(), (C51027dr[]) cqVar.toArray(new C51027dr[cqVar.size()])));
                                this.f36955g.setVisibility(0);
                                this.f36955g.setOnItemClickListener(new C11418y(this));
                            }
                            if ((bnVar.f132680a & 8) != 0) {
                                C50936ah ahVar = bnVar.f132684e;
                                if (ahVar == null) {
                                    ahVar = C50936ah.f132593m;
                                }
                                View inflate = LayoutInflater.from(this.f37159r).inflate(R.layout.contact_disambiguation_pick_another_contact_nga, (ViewGroup) null);
                                ImageComponent imageComponent = (ImageComponent) inflate.findViewById(R.id.pick_another_contact_nga_image_component);
                                TextView textView = (TextView) inflate.findViewById(R.id.pick_another_contact_nga_text_view);
                                imageComponent.setVisibility(0);
                                if ((ahVar.f132595a & 32) != 0) {
                                    C51012dc dcVar = ahVar.f132601g;
                                    if (dcVar == null) {
                                        dcVar = C51012dc.f132813k;
                                    }
                                    imageComponent.mo19786b(dcVar, (Drawable) null);
                                }
                                textView.setVisibility(0);
                                textView.setText(ahVar.f132596b == 1 ? (String) ahVar.f132597c : BuildConfig.FLAVOR);
                                this.f36957i.addView(inflate);
                                this.f36957i.setPadding(0, 0, 0, 0);
                                this.f36957i.setVisibility(0);
                                this.f36957i.setOnClickListener(new C11417x(this));
                                return;
                            }
                            return;
                        }
                        if ((bnVar.f132680a & 8) == 0) {
                            z = false;
                        }
                        m27007w(bnVar, z, false);
                        return;
                    case 7:
                        mo19835s(13);
                        m27006v(bnVar, false);
                        return;
                    default:
                        ((C59052c) ((C59052c) f36949a.mo56225c()).mo56372aa(43237)).mo56386p("Unsupported contact selection header UI mode.");
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
    public final void mo19831d(View view) {
        C11301i iVar;
        C28292j a = C28295m.m52915a(view);
        if (a != null && (iVar = this.f37152k) != null) {
            iVar.mo19732o(a);
        }
    }

    /* renamed from: e */
    public final void mo19748e(long j) {
        C11301i iVar = this.f37152k;
        if (iVar != null) {
            C60856cj.m92911t(iVar.mo19730m(j, this.f36961w), new C11419z(this), new C90930c());
        }
    }

    /* renamed from: f */
    public final void mo19832f(View view, int i) {
        C50969bn bnVar;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 16) {
                bnVar = (C50969bn) euVar.f136278f;
            } else {
                bnVar = C50969bn.f132678i;
            }
            C28292j jVar = new C28292j((bnVar.f132680a & 16) != 0 ? bnVar.f132685f : 92560);
            jVar.mo33795i(5);
            aqp aqp = jVar.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = i;
            jVar.mo33795i(4);
            C28295m.m52919e(view, jVar);
        }
    }

    /* renamed from: m */
    public final void mo19821m(C11295c cVar) {
        C51941eu euVar;
        this.f37153l = cVar;
        mo19809b();
        C11295c cVar2 = this.f37153l;
        if (cVar2 != null && (euVar = cVar2.f36729a) != null && euVar.f136277e == 16) {
            C50969bn bnVar = (C50969bn) euVar.f136278f;
            if ((bnVar.f132680a & 64) != 0) {
                int a = C50968bm.m85997a(bnVar.f132687h);
                if (a == 0) {
                    a = 1;
                }
                this.f36961w = a;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36950b = (TextView) findViewById(R.id.contact_selection_field_title);
        this.f36951c = (TextView) findViewById(R.id.contact_selection_text);
        this.f36954f = (ListView) findViewById(R.id.contact_disambiguation);
        this.f36955g = (ListView) findViewById(R.id.contact_disambiguation_listview_nga);
        this.f36959u = (GridView) findViewById(R.id.contact_disambiguation_for_coinview);
        this.f36960v = (RecyclerView) findViewById(R.id.contact_disambiguation_recyclerview_nga);
        this.f36956h = (LinearLayout) findViewById(R.id.contact_selection);
        this.f36957i = (LinearLayout) findViewById(R.id.pick_contact_container_view);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_selected_item);
        this.f36953e = linearLayout;
        this.f36952d = (TextView) linearLayout.findViewById(R.id.contact_selected_item_title);
        this.f36958t = (TextView) this.f36953e.findViewById(R.id.contact_selected_item_description);
    }

    /* renamed from: r */
    public final void mo19834r(C52479tg tgVar) {
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

    /* renamed from: s */
    public final void mo19835s(int i) {
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

    public ContactSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ContactSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ContactSelectionField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
