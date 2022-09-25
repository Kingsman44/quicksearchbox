package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.text.method.LinkMovementMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C2333ah;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p509a.C9437a;
import com.google.android.apps.gsa.assistant.settings.shared.o;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemLayout;
import com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C50253qf;
import com.google.assistant.p3861at.C50255qh;
import com.google.assistant.p3861at.C50256qi;
import com.google.assistant.p3861at.C50260qm;
import com.google.assistant.p3861at.C50263qp;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50265qr;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50270qw;
import com.google.assistant.p3861at.C50272qy;
import com.google.assistant.p3861at.C50279re;
import com.google.assistant.p3861at.C50282rh;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ca */
/* compiled from: PG */
public final /* synthetic */ class C9945ca implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34081a;

    public /* synthetic */ C9945ca(C9958cn cnVar) {
        this.f34081a = cnVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        View view;
        C50260qm qmVar;
        C50253qf qfVar;
        C50253qf qfVar2;
        C50256qi qiVar;
        C50256qi qiVar2;
        int i;
        View view2;
        NestedScrollView nestedScrollView;
        C9958cn cnVar = this.f34081a;
        C50282rh rhVar = (C50282rh) obj;
        if (rhVar != null) {
            C50270qw qwVar = (C50270qw) rhVar.f130765b.get(cnVar.f34109i);
            LayoutInflater layoutInflater = cnVar.f34102b.getLayoutInflater();
            cnVar.f34101a.removeAllViews();
            if (cnVar.f34106f.mo79746e(C90059dk.f249095bE) && !cnVar.f34106f.mo79746e(C90014bt.f247382gB)) {
                cnVar.f34108h.mo18312a(cnVar.f34101a, qwVar.f130729b, new C9949ce(cnVar)).ifPresent(new C9950cf(cnVar));
            }
            for (C50272qy qyVar : qwVar.f130730c) {
                int i2 = qyVar.f130734a;
                if (i2 == 1) {
                    C50264qq qqVar = (C50264qq) qyVar.f130735b;
                    ItemLayout c = cnVar.mo18155c(layoutInflater, qqVar);
                    C50266qs qsVar = qqVar.f130715e;
                    if (qsVar == null) {
                        qsVar = C50266qs.f130716c;
                    }
                    c.setOnClickListener(cnVar.mo18154b(qsVar));
                    cnVar.f34101a.addView(c);
                } else {
                    if (i2 == 2) {
                        SectionHeaderView sectionHeaderView = new SectionHeaderView(cnVar.f34102b.getContext());
                        if (qyVar.f130734a == 2) {
                            qfVar = (C50253qf) qyVar.f130735b;
                        } else {
                            qfVar = C50253qf.f130682c;
                        }
                        sectionHeaderView.c(qfVar.f130684a);
                        sectionHeaderView.setId(R.id.section_header_view);
                        cnVar.f34101a.addView(sectionHeaderView);
                        if (!(cnVar.f34110j != 1 || (view2 = cnVar.f34102b.getView()) == null || (nestedScrollView = (NestedScrollView) view2.findViewById(R.id.scrollview)) == null)) {
                            nestedScrollView.post(new C9948cd(nestedScrollView, sectionHeaderView));
                        }
                        if (qyVar.f130734a == 2) {
                            qfVar2 = (C50253qf) qyVar.f130735b;
                        } else {
                            qfVar2 = C50253qf.f130682c;
                        }
                        C58480gp e = C58485gu.m89837e();
                        C58480gp e2 = C58485gu.m89837e();
                        C58485gu d = cnVar.f34104d.d();
                        int size = d.size();
                        int i3 = 0;
                        while (i3 < size) {
                            C49875cf cfVar = (C49875cf) d.get(i3);
                            C58800sl lA = cnVar.f34104d.mo65237f(cfVar, (C49893cx) null, (act) null).iterator();
                            while (true) {
                                i = i3 + 1;
                                if (!lA.hasNext()) {
                                    break;
                                }
                                Pair pair = (Pair) lA.next();
                                C50255qh qhVar = (C50255qh) C50256qi.f130687d.createBuilder();
                                qhVar.copyOnWrite();
                                C50256qi qiVar3 = (C50256qi) qhVar.instance;
                                qiVar3.f130690b = cfVar.f129621v;
                                qiVar3.f130689a |= 1;
                                qhVar.copyOnWrite();
                                C50256qi qiVar4 = (C50256qi) qhVar.instance;
                                qiVar4.f130689a |= 2;
                                qiVar4.f130691c = (String) C58831av.m90830c((String) pair.first, BuildConfig.FLAVOR);
                                C50256qi qiVar5 = (C50256qi) qhVar.build();
                                C50263qp qpVar = (C50263qp) C50264qq.f130709f.createBuilder();
                                String str = (String) pair.second;
                                qpVar.copyOnWrite();
                                C50264qq qqVar2 = (C50264qq) qpVar.instance;
                                str.getClass();
                                qqVar2.f130711a |= 1;
                                qqVar2.f130712b = str;
                                C50265qr qrVar = (C50265qr) C50266qs.f130716c.createBuilder();
                                qrVar.copyOnWrite();
                                C50266qs qsVar2 = (C50266qs) qrVar.instance;
                                qiVar5.getClass();
                                qsVar2.f130719b = qiVar5;
                                qsVar2.f130718a = 2;
                                qpVar.copyOnWrite();
                                C50264qq qqVar3 = (C50264qq) qpVar.instance;
                                C50266qs qsVar3 = (C50266qs) qrVar.build();
                                qsVar3.getClass();
                                qqVar3.f130715e = qsVar3;
                                qqVar3.f130711a |= 8;
                                e2.mo55395g((C50264qq) qpVar.build());
                            }
                            i3 = i;
                        }
                        e.mo55396h(e2.mo55394f());
                        e.mo55396h(qfVar2.f130685b);
                        C58485gu f = e.mo55394f();
                        int i4 = ((C58724pq) f).f156474d;
                        for (int i5 = 0; i5 < i4; i5++) {
                            C50264qq qqVar4 = (C50264qq) f.get(i5);
                            ItemLayout inflate = layoutInflater.inflate(R.layout.settings_item_layout, cnVar.f34101a, false);
                            inflate.p(qqVar4.f130712b);
                            if ((qqVar4.f130711a & 2) != 0) {
                                inflate.o(qqVar4.f130713c);
                            }
                            o oVar = cnVar.f34104d;
                            C50266qs qsVar4 = qqVar4.f130715e;
                            if (qsVar4 == null) {
                                qsVar4 = C50266qs.f130716c;
                            }
                            if (qsVar4.f130718a == 2) {
                                qiVar = (C50256qi) qsVar4.f130719b;
                            } else {
                                qiVar = C50256qi.f130687d;
                            }
                            C49875cf a = C49875cf.m85755a(qiVar.f130690b);
                            if (a == null) {
                                a = C49875cf.UNKNOWN;
                            }
                            C50266qs qsVar5 = qqVar4.f130715e;
                            if (qsVar5 == null) {
                                qsVar5 = C50266qs.f130716c;
                            }
                            if (qsVar5.f130718a == 2) {
                                qiVar2 = (C50256qi) qsVar5.f130719b;
                            } else {
                                qiVar2 = C50256qi.f130687d;
                            }
                            inflate.h(oVar.b(a, qiVar2.f130691c));
                            C50266qs qsVar6 = qqVar4.f130715e;
                            if (qsVar6 == null) {
                                qsVar6 = C50266qs.f130716c;
                            }
                            inflate.setOnClickListener(cnVar.mo18154b(qsVar6));
                            cnVar.f34101a.addView(inflate);
                        }
                        if (cnVar.f34106f.mo79746e(C90059dk.f249166d)) {
                            ItemLayout inflate2 = layoutInflater.inflate(R.layout.settings_item_layout, cnVar.f34101a, false);
                            inflate2.p(inflate2.f(R.string.assistant_settings_add_device_title));
                            inflate2.h(R.drawable.quantum_ic_add_grey600_24);
                            inflate2.setOnClickListener(new C9951cg(cnVar));
                            cnVar.f34101a.addView(inflate2);
                        }
                    } else if (i2 == 3) {
                        SectionHeaderView sectionHeaderView2 = new SectionHeaderView(cnVar.f34102b.getContext());
                        if (qyVar.f130734a == 3) {
                            qmVar = (C50260qm) qyVar.f130735b;
                        } else {
                            qmVar = C50260qm.f130697e;
                        }
                        sectionHeaderView2.c(qmVar.f130700b);
                        sectionHeaderView2.setId(R.id.section_header_view);
                        if ((qmVar.f130699a & 2) != 0) {
                            C50279re reVar = qmVar.f130702d;
                            if (reVar == null) {
                                reVar = C50279re.f130752d;
                            }
                            sectionHeaderView2.a().setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_settings_grey600_24, 0);
                            sectionHeaderView2.setOnClickListener(new C9952ch(cnVar, reVar));
                        }
                        cnVar.f34101a.addView(sectionHeaderView2);
                        for (C50264qq qqVar5 : qmVar.f130701c) {
                            ItemLayout c2 = cnVar.mo18155c(layoutInflater, qqVar5);
                            C50266qs qsVar7 = qqVar5.f130715e;
                            if (qsVar7 == null) {
                                qsVar7 = C50266qs.f130716c;
                            }
                            c2.setOnClickListener(cnVar.mo18154b(qsVar7));
                            cnVar.f34101a.addView(c2);
                        }
                    }
                }
            }
            if (cnVar.f34106f.mo79746e(C90059dk.f249130bn) && cnVar.f34109i == 0 && (view = cnVar.f34102b.getView()) != null) {
                layoutInflater.inflate(R.layout.policies_footer, cnVar.f34101a);
                TextView textView = (TextView) view.findViewById(R.id.tos_text);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(LinkUtil.m133792b(C9437a.m23954b(cnVar.f34102b.getResources())));
                TextView textView2 = (TextView) view.findViewById(R.id.pp_text);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setText(LinkUtil.m133792b(C9437a.m23953a(cnVar.f34102b.getResources())));
            }
        }
    }
}
