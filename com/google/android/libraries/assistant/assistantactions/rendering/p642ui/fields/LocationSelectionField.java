package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p636e.C11278h;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.C11339f;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11326n;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51031dv;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;
import com.google.assistant.p3897e.p3902c.p3907c.C51037ea;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52495tw;
import com.google.assistant.p3897e.p3921j.C52496tx;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.LocationSelectionField */
/* compiled from: PG */
public class LocationSelectionField extends C11407n implements C11326n {

    /* renamed from: a */
    public static final C59071e f37010a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.LocationSelectionField");

    /* renamed from: b */
    public SpinnerComponent f37011b;

    /* renamed from: c */
    public LinearLayout f37012c;

    /* renamed from: d */
    public C11381bn f37013d;

    /* renamed from: e */
    public C51034dy f37014e = C51034dy.f132878i;

    /* renamed from: f */
    public int f37015f = -1;

    /* renamed from: g */
    private TextView f37016g;

    /* renamed from: h */
    private ImageComponent f37017h;

    /* renamed from: i */
    private LinearLayout f37018i;

    /* renamed from: t */
    private TextView f37019t;

    /* renamed from: u */
    private C11339f f37020u;

    /* renamed from: v */
    private C51034dy f37021v = C51034dy.f132878i;

    public LocationSelectionField(Context context) {
        super(context);
    }

    /* renamed from: f */
    private static boolean m27059f(C51034dy dyVar) {
        if (dyVar == null) {
            return false;
        }
        C51016dg dgVar = dyVar.f132884e;
        if (dgVar == null) {
            dgVar = C51016dg.f132827g;
        }
        C51805du duVar = dgVar.f132833e;
        if (duVar == null) {
            duVar = C51805du.f135924e;
        }
        if (!duVar.f135927b.equals("asst_input.INTENT_UPDATE")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19759a(C52541vo voVar) {
        if (this.f37153l != null && this.f37154m != null) {
            if ((this.f37015f < 0 && C51034dy.f132878i.equals(this.f37021v)) || this.f37013d == null) {
                return;
            }
            if (C51034dy.f132878i.equals(this.f37021v)) {
                C51034dy dyVar = (C51034dy) this.f37013d.getItem(this.f37015f);
                if (dyVar != null) {
                    C51031dv dvVar = (C51031dv) dyVar.toBuilder();
                    dvVar.copyOnWrite();
                    C51034dy dyVar2 = (C51034dy) dvVar.instance;
                    voVar.getClass();
                    dyVar2.f132883d = voVar;
                    dyVar2.f132880a |= 4;
                    C51034dy dyVar3 = (C51034dy) dvVar.build();
                    this.f37013d.insert(dyVar3, this.f37015f);
                    C11381bn bnVar = this.f37013d;
                    bnVar.remove((C51034dy) bnVar.getItem(this.f37015f + 1));
                    this.f37013d.notifyDataSetChanged();
                    mo19859c(dyVar3);
                }
            } else if (this.f37153l != null && this.f37154m != null) {
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
                C52495tw twVar = (C52495tw) C52496tx.f137813c.createBuilder();
                twVar.copyOnWrite();
                C52496tx txVar = (C52496tx) twVar.instance;
                voVar.getClass();
                txVar.f137816b = voVar;
                txVar.f137815a = 1 | txVar.f137815a;
                tpVar.copyOnWrite();
                C52490tr trVar4 = (C52490tr) tpVar.instance;
                C52496tx txVar2 = (C52496tx) twVar.build();
                txVar2.getClass();
                trVar4.f137799c = txVar2;
                trVar4.f137798b = 7;
                C11295c cVar = this.f37153l;
                cVar.f36730b = (C52490tr) tpVar.build();
                C11298f a = this.f37154m.mo19691a(cVar);
                C51034dy dyVar4 = this.f37021v;
                if ((dyVar4.f132880a & 8) == 0) {
                    mo19941h(a);
                } else if (m27059f(dyVar4)) {
                    C51016dg dgVar = this.f37021v.f132884e;
                    if (dgVar == null) {
                        dgVar = C51016dg.f132827g;
                    }
                    C51805du duVar = dgVar.f132833e;
                    if (duVar == null) {
                        duVar = C51805du.f135924e;
                    }
                    mo19943j(C11278h.m26772b(duVar, voVar));
                } else {
                    C51016dg dgVar2 = this.f37021v.f132884e;
                    if (dgVar2 == null) {
                        dgVar2 = C51016dg.f132827g;
                    }
                    mo19942i(dgVar2, a);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51037ea eaVar;
        int a;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null && this.f37013d != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 11) {
                eaVar = (C51037ea) euVar.f136278f;
            } else {
                eaVar = C51037ea.f132889e;
            }
            this.f37016g.setText(eaVar.f132892b);
            ArrayList arrayList = new ArrayList(eaVar.f132893c);
            int i = 1;
            if (arrayList.size() == 1 && (a = C51033dx.m86018a(((C51034dy) arrayList.get(0)).f132885f)) != 0 && a == 2) {
                this.f37021v = (C51034dy) arrayList.get(0);
                if ((eaVar.f132891a & 1) == 0) {
                    this.f37016g.setVisibility(8);
                }
                if ((this.f37021v.f132880a & 1) != 0) {
                    this.f37019t.setVisibility(0);
                    this.f37019t.setText(this.f37021v.f132881b);
                }
                C51034dy dyVar = this.f37021v;
                if ((dyVar.f132880a & 64) != 0) {
                    C51012dc dcVar = dyVar.f132887h;
                    if (dcVar == null) {
                        dcVar = C51012dc.f132813k;
                    }
                    if ((dcVar.f132815a & 2) != 0) {
                        this.f37017h.setVisibility(0);
                        this.f37018i.setVisibility(0);
                        ImageComponent imageComponent = this.f37017h;
                        C51012dc dcVar2 = this.f37021v.f132887h;
                        String str = (dcVar2 == null ? C51012dc.f132813k : dcVar2).f132817c;
                        if (dcVar2 == null) {
                            dcVar2 = C51012dc.f132813k;
                        }
                        int a2 = C51014de.m86008a(dcVar2.f132816b);
                        if (a2 != 0) {
                            i = a2;
                        }
                        imageComponent.mo19788d(str, i);
                        return;
                    }
                    return;
                }
                return;
            }
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C51034dy dyVar2 = (C51034dy) it.next();
                if ((dyVar2.f132880a & 2) != 0 && dyVar2.f132882c) {
                    break;
                }
                i2++;
            }
            this.f37015f = i2;
            if (i2 != -1) {
                this.f37013d.clear();
                this.f37013d.addAll(arrayList);
                this.f37011b.setAdapter((SpinnerAdapter) this.f37013d);
                this.f37011b.setVisibility(0);
                this.f37011b.setSelection(this.f37015f, false);
                C51034dy dyVar3 = (C51034dy) arrayList.get(this.f37015f);
                this.f37014e = dyVar3;
                if ((dyVar3.f132880a & 4) != 0) {
                    this.f37016g.setVisibility(0);
                } else {
                    this.f37016g.setVisibility(4);
                }
            }
            mo19860e();
        }
    }

    /* renamed from: d */
    public final void mo19760d(Intent intent, C22694ag agVar) {
        C11301i iVar = this.f37152k;
        if (iVar != null) {
            iVar.mo19726i(intent, agVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37016g = (TextView) findViewById(R.id.location_selection_field_title);
        this.f37012c = (LinearLayout) findViewById(R.id.single_location_picker);
        this.f37018i = (LinearLayout) findViewById(R.id.single_location_picker_image_container);
        this.f37017h = (ImageComponent) findViewById(R.id.single_location_picker_image);
        this.f37019t = (TextView) findViewById(R.id.single_location_picker_text);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.location_list);
        this.f37011b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f37013d = new C11381bn(this, getContext());
        C11377bj bjVar = new C11377bj(this);
        this.f37020u = bjVar;
        SpinnerComponent spinnerComponent2 = this.f37011b;
        spinnerComponent2.f36871e = bjVar;
        spinnerComponent2.setOnFocusChangeListener(new C11378bk(this));
        this.f37011b.setOnTouchListener(new C11379bl(this));
        this.f37012c.setOnClickListener(new C11380bm(this));
    }

    public LocationSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocationSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: e */
    public final void mo19860e() {
        int i;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            if (cVar.mo19717a()) {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_error_color);
            } else if (this.f37151j) {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_highlight_field_color);
            } else {
                i = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_nonhighlight_field_title_color);
            }
            this.f37016g.setTextColor(i);
        }
        if (this.f37011b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f37011b;
            spinnerComponent.mo19803c(spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19859c(com.google.assistant.p3897e.p3902c.p3907c.C51034dy r10) {
        /*
            r9 = this;
            r9.f37014e = r10
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            r1 = 1
            if (r0 != 0) goto L_0x0009
            goto L_0x00bd
        L_0x0009:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            com.google.protobuf.bn r2 = r10.toBuilder()
            com.google.assistant.e.c.c.dv r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.dy r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r3
            int r4 = r3.f132880a
            r4 = r4 | 2
            r3.f132880a = r4
            r3.f132882c = r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.dy r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r2
            int r3 = r0.f136277e
            r4 = 11
            if (r3 != r4) goto L_0x0031
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.ea r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r3
            goto L_0x0033
        L_0x0031:
            com.google.assistant.e.c.c.ea r3 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.f132889e
        L_0x0033:
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.assistant.e.c.c.dz r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51035dz) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.c.c.ea r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r5
            com.google.protobuf.cq r6 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.emptyProtobufList()
            r5.f132893c = r6
            int r5 = r0.f136277e
            if (r5 != r4) goto L_0x004f
            java.lang.Object r5 = r0.f136278f
            com.google.assistant.e.c.c.ea r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r5
            goto L_0x0051
        L_0x004f:
            com.google.assistant.e.c.c.ea r5 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.f132889e
        L_0x0051:
            com.google.protobuf.cq r5 = r5.f132893c
            java.util.Iterator r5 = r5.iterator()
        L_0x0057:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0099
            java.lang.Object r6 = r5.next()
            com.google.assistant.e.c.c.dy r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r6
            com.google.protobuf.bn r7 = r6.toBuilder()
            com.google.assistant.e.c.c.dv r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r7
            int r8 = r6.f132880a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0085
            int r8 = r2.f132880a
            r8 = r8 & r1
            if (r8 == 0) goto L_0x0085
            java.lang.String r6 = r6.f132881b
            java.lang.String r8 = r2.f132881b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0085
            com.google.protobuf.bn r6 = r2.toBuilder()
            r7 = r6
            com.google.assistant.e.c.c.dv r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r7
            goto L_0x0095
        L_0x0085:
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.assistant.e.c.c.dy r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r6
            int r8 = r6.f132880a
            r8 = r8 | 2
            r6.f132880a = r8
            r8 = 0
            r6.f132882c = r8
        L_0x0095:
            r3.mo53507a(r7)
            goto L_0x0057
        L_0x0099:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.c.c.ea r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r3
            r3.getClass()
            r2.f136278f = r3
            r2.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            r2.f36729a = r0
        L_0x00bd:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x014b
            int r0 = r10.f132880a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x014b
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            java.lang.String r2 = r2.f136280h
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r2.getClass()
            int r4 = r3.f137797a
            r4 = r4 | r1
            r3.f137797a = r4
            r3.f137800d = r2
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            java.lang.String r2 = r2.f136280h
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r2.getClass()
            int r4 = r3.f137797a
            r4 = r4 | 2
            r3.f137797a = r4
            r3.f137801e = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            int r3 = r2.f137797a
            r3 = r3 | 4
            r2.f137797a = r3
            r2.f137802f = r1
            com.google.assistant.e.j.tx r2 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.tw r2 = (com.google.assistant.p3897e.p3921j.C52495tw) r2
            com.google.assistant.e.j.vo r3 = r10.f132883d
            if (r3 != 0) goto L_0x011b
            com.google.assistant.e.j.vo r3 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x011b:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.j.tx r4 = (com.google.assistant.p3897e.p3921j.C52496tx) r4
            r3.getClass()
            r4.f137816b = r3
            int r3 = r4.f137815a
            r1 = r1 | r3
            r4.f137815a = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.tx r2 = (com.google.assistant.p3897e.p3921j.C52496tx) r2
            r2.getClass()
            r1.f137799c = r2
            r2 = 7
            r1.f137798b = r2
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r1 = r9.f37153l
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            r1.f36730b = r0
        L_0x014b:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x018b
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r1 = r9.f37154m
            if (r1 != 0) goto L_0x0154
            goto L_0x018b
        L_0x0154:
            com.google.android.libraries.assistant.assistantactions.rendering.c.f r0 = r1.mo19691a(r0)
            int r1 = r10.f132880a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0188
            boolean r1 = m27059f(r10)
            if (r1 == 0) goto L_0x017e
            com.google.assistant.e.c.c.dg r0 = r10.f132884e
            if (r0 != 0) goto L_0x016a
            com.google.assistant.e.c.c.dg r0 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x016a:
            com.google.assistant.e.j.du r0 = r0.f132833e
            if (r0 != 0) goto L_0x0170
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0170:
            com.google.assistant.e.j.vo r10 = r10.f132883d
            if (r10 != 0) goto L_0x0176
            com.google.assistant.e.j.vo r10 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x0176:
            com.google.assistant.e.j.du r10 = com.google.android.libraries.assistant.assistantactions.p636e.C11278h.m26772b(r0, r10)
            r9.mo19943j(r10)
            return
        L_0x017e:
            com.google.assistant.e.c.c.dg r10 = r10.f132884e
            if (r10 != 0) goto L_0x0184
            com.google.assistant.e.c.c.dg r10 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0184:
            r9.mo19942i(r10, r0)
            return
        L_0x0188:
            r9.mo19941h(r0)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.LocationSelectionField.mo19859c(com.google.assistant.e.c.c.dy):void");
    }
}
