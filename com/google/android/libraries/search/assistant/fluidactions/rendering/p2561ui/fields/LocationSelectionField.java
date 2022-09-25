package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.C33266g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33254m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51031dv;
import com.google.assistant.p3897e.p3902c.p3907c.C51033dx;
import com.google.assistant.p3897e.p3902c.p3907c.C51034dy;
import com.google.assistant.p3897e.p3902c.p3907c.C51037ea;
import com.google.assistant.p3897e.p3921j.C52488tp;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52491ts;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52495tw;
import com.google.assistant.p3897e.p3921j.C52496tx;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.LocationSelectionField */
/* compiled from: PG */
public final class LocationSelectionField extends LinearLayout implements C33177b, C33254m {

    /* renamed from: a */
    public static final C59071e f89135a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.LocationSelectionField");

    /* renamed from: b */
    public SpinnerComponent f89136b = null;

    /* renamed from: c */
    public LinearLayout f89137c = null;

    /* renamed from: d */
    public C33322ca f89138d;

    /* renamed from: e */
    public C51034dy f89139e = C51034dy.f132878i;

    /* renamed from: f */
    public int f89140f = -1;

    /* renamed from: g */
    public boolean f89141g = false;

    /* renamed from: h */
    public C51941eu f89142h;

    /* renamed from: i */
    public C33182g f89143i;

    /* renamed from: j */
    public C32942a f89144j;

    /* renamed from: k */
    public C33170a f89145k;

    /* renamed from: l */
    private TextView f89146l = null;

    /* renamed from: m */
    private ImageComponent f89147m = null;

    /* renamed from: n */
    private LinearLayout f89148n = null;

    /* renamed from: o */
    private TextView f89149o = null;

    /* renamed from: p */
    private C33266g f89150p;

    /* renamed from: q */
    private C51034dy f89151q = C51034dy.f132878i;

    public LocationSelectionField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38634a(C52541vo voVar) {
        if ((this.f89140f < 0 && C51034dy.f132878i.equals(this.f89151q)) || this.f89138d == null) {
            return;
        }
        if (C51034dy.f132878i.equals(this.f89151q)) {
            C51034dy dyVar = (C51034dy) this.f89138d.getItem(this.f89140f);
            if (dyVar != null) {
                C51031dv dvVar = (C51031dv) dyVar.toBuilder();
                dvVar.copyOnWrite();
                C51034dy dyVar2 = (C51034dy) dvVar.instance;
                voVar.getClass();
                dyVar2.f132883d = voVar;
                dyVar2.f132880a |= 4;
                C51034dy dyVar3 = (C51034dy) dvVar.build();
                this.f89138d.insert(dyVar3, this.f89140f);
                C33322ca caVar = this.f89138d;
                caVar.remove((C51034dy) caVar.getItem(this.f89140f + 1));
                this.f89138d.notifyDataSetChanged();
                mo38714h(dyVar3);
            }
        } else if (this.f89142h == null || this.f89143i == null || this.f89144j == null) {
            ((C59052c) ((C59052c) f89135a.mo56226d()).mo56372aa(51108)).mo56386p("Failed to handle single picker click due to invalid args");
        } else {
            C52488tp tpVar = (C52488tp) C52490tr.f137795g.createBuilder();
            String str = this.f89142h.f136279g;
            tpVar.copyOnWrite();
            C52490tr trVar = (C52490tr) tpVar.instance;
            str.getClass();
            trVar.f137797a |= 1;
            trVar.f137800d = str;
            String str2 = this.f89142h.f136280h;
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
            txVar.f137815a |= 1;
            tpVar.copyOnWrite();
            C52490tr trVar4 = (C52490tr) tpVar.instance;
            C52496tx txVar2 = (C52496tx) twVar.build();
            txVar2.getClass();
            trVar4.f137799c = txVar2;
            trVar4.f137798b = 7;
            C52491ts tsVar = (C52491ts) C52492tt.f137803d.createBuilder();
            C51953ff a = this.f89143i.mo38576a();
            tsVar.copyOnWrite();
            C52492tt ttVar = (C52492tt) tsVar.instance;
            a.getClass();
            ttVar.f137806b = a;
            ttVar.f137805a = 1 | ttVar.f137805a;
            C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
            ugVar.mo53877a((C52490tr) tpVar.build());
            tsVar.copyOnWrite();
            C52492tt ttVar2 = (C52492tt) tsVar.instance;
            C52507uh uhVar = (C52507uh) ugVar.build();
            uhVar.getClass();
            ttVar2.f137807c = uhVar;
            ttVar2.f137805a |= 2;
            C52492tt ttVar3 = (C52492tt) tsVar.build();
            C32942a aVar = this.f89144j;
            C51016dg dgVar = this.f89151q.f132884e;
            if (dgVar == null) {
                dgVar = C51016dg.f132827g;
            }
            aVar.mo38364a("FA Location OnlySingle", ttVar3, dgVar);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51037ea eaVar;
        int a;
        C51941eu euVar = this.f89142h;
        if (euVar == null || this.f89143i == null || this.f89138d == null || this.f89146l == null || this.f89149o == null || this.f89148n == null || this.f89147m == null || this.f89136b == null) {
            ((C59052c) ((C59052c) f89135a.mo56226d()).mo56372aa(51110)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89142h = euVar2;
            this.f89143i.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89142h;
        if (euVar3.f136277e == 11) {
            eaVar = (C51037ea) euVar3.f136278f;
        } else {
            eaVar = C51037ea.f132889e;
        }
        this.f89146l.setText(eaVar.f132892b);
        ArrayList arrayList = new ArrayList(eaVar.f132893c);
        if (arrayList.size() == 1 && (a = C51033dx.m86018a(((C51034dy) arrayList.get(0)).f132885f)) != 0 && a == 2) {
            this.f89151q = (C51034dy) arrayList.get(0);
            if ((eaVar.f132891a & 1) == 0) {
                this.f89146l.setVisibility(8);
            }
            if ((this.f89151q.f132880a & 1) != 0) {
                this.f89149o.setVisibility(0);
                this.f89149o.setText(this.f89151q.f132881b);
            }
            C51034dy dyVar = this.f89151q;
            if ((dyVar.f132880a & 64) != 0) {
                C51012dc dcVar = dyVar.f132887h;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                if ((dcVar.f132815a & 2) != 0) {
                    this.f89147m.setVisibility(0);
                    this.f89148n.setVisibility(0);
                    ImageComponent imageComponent = this.f89147m;
                    C51012dc dcVar2 = this.f89151q.f132887h;
                    if (dcVar2 == null) {
                        dcVar2 = C51012dc.f132813k;
                    }
                    imageComponent.mo38649b(dcVar2, (Drawable) null);
                    return;
                }
                return;
            }
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C51034dy dyVar2 = (C51034dy) it.next();
            if ((dyVar2.f132880a & 2) != 0 && dyVar2.f132882c) {
                break;
            }
            i++;
        }
        this.f89140f = i;
        if (i != -1) {
            this.f89138d.clear();
            this.f89138d.addAll(arrayList);
            this.f89136b.setAdapter((SpinnerAdapter) this.f89138d);
            this.f89136b.setVisibility(0);
            this.f89136b.setSelection(this.f89140f, false);
            C51034dy dyVar3 = (C51034dy) arrayList.get(this.f89140f);
            this.f89139e = dyVar3;
            if ((dyVar3.f132880a & 4) != 0) {
                this.f89146l.setVisibility(0);
            } else {
                this.f89146l.setVisibility(4);
            }
        }
        mo38715i();
    }

    /* renamed from: f */
    public final void mo38565f() {
        SpinnerComponent spinnerComponent = this.f89136b;
        if (spinnerComponent != null) {
            spinnerComponent.requestFocus();
            this.f89136b.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        SpinnerComponent spinnerComponent = this.f89136b;
        if (spinnerComponent != null) {
            spinnerComponent.clearFocus();
        }
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38714h(com.google.assistant.p3897e.p3902c.p3907c.C51034dy r9) {
        /*
            r8 = this;
            r8.f89139e = r9
            com.google.assistant.e.j.e.eu r0 = r8.f89142h
            if (r0 == 0) goto L_0x01ad
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89143i
            if (r1 == 0) goto L_0x01ad
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89144j
            if (r1 != 0) goto L_0x0010
            goto L_0x01ad
        L_0x0010:
            int r1 = r0.f136277e
            r2 = 11
            if (r1 != r2) goto L_0x001b
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ea r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r0
            goto L_0x001d
        L_0x001b:
            com.google.assistant.e.c.c.ea r0 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.f132889e
        L_0x001d:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.dz r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51035dz) r0
            com.google.protobuf.bn r1 = r9.toBuilder()
            com.google.assistant.e.c.c.dv r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.c.c.dy r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r3
            int r4 = r3.f132880a
            r4 = r4 | 2
            r3.f132880a = r4
            r4 = 1
            r3.f132882c = r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.c.c.dy r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.ea r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r3
            r1.getClass()
            r3.f132894d = r1
            int r5 = r3.f132891a
            r5 = r5 | 2
            r3.f132891a = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.c.c.ea r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r3
            com.google.protobuf.cq r5 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.emptyProtobufList()
            r3.f132893c = r5
            com.google.assistant.e.j.e.eu r3 = r8.f89142h
            int r5 = r3.f136277e
            if (r5 != r2) goto L_0x0069
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.ea r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r3
            goto L_0x006b
        L_0x0069:
            com.google.assistant.e.c.c.ea r3 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.f132889e
        L_0x006b:
            com.google.protobuf.cq r3 = r3.f132893c
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.dy r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.c.c.dv r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r6
            int r7 = r5.f132880a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            int r7 = r1.f132880a
            r7 = r7 & r4
            if (r7 == 0) goto L_0x009f
            java.lang.String r5 = r5.f132881b
            java.lang.String r7 = r1.f132881b
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x009f
            com.google.protobuf.bn r5 = r1.toBuilder()
            r6 = r5
            com.google.assistant.e.c.c.dv r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51031dv) r6
            goto L_0x00af
        L_0x009f:
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.dy r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r5
            int r7 = r5.f132880a
            r7 = r7 | 2
            r5.f132880a = r7
            r7 = 0
            r5.f132882c = r7
        L_0x00af:
            r0.mo53507a(r6)
            goto L_0x0071
        L_0x00b3:
            com.google.assistant.e.j.e.eu r1 = r8.f89142h
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.ea r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r0
            r0.getClass()
            r3.f136278f = r0
            r3.f136277e = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r8.f89142h = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r1 = r8.f89143i
            r1.mo38581f(r0)
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.assistant.e.j.e.eu r1 = r8.f89142h
            java.lang.String r1 = r1.f136279g
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r1.getClass()
            int r3 = r2.f137797a
            r3 = r3 | r4
            r2.f137797a = r3
            r2.f137800d = r1
            com.google.assistant.e.j.e.eu r1 = r8.f89142h
            java.lang.String r1 = r1.f136280h
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            r1.getClass()
            int r3 = r2.f137797a
            r3 = r3 | 2
            r2.f137797a = r3
            r2.f137801e = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            int r2 = r1.f137797a
            r2 = r2 | 4
            r1.f137797a = r2
            r1.f137802f = r4
            com.google.assistant.e.j.tx r1 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.tw r1 = (com.google.assistant.p3897e.p3921j.C52495tw) r1
            com.google.assistant.e.j.vo r2 = r9.f132883d
            if (r2 != 0) goto L_0x012c
            com.google.assistant.e.j.vo r2 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x012c:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.tx r3 = (com.google.assistant.p3897e.p3921j.C52496tx) r3
            r2.getClass()
            r3.f137816b = r2
            int r2 = r3.f137815a
            r2 = r2 | r4
            r3.f137815a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.tr r2 = (com.google.assistant.p3897e.p3921j.C52490tr) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.tx r1 = (com.google.assistant.p3897e.p3921j.C52496tx) r1
            r1.getClass()
            r2.f137799c = r1
            r1 = 7
            r2.f137798b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            com.google.assistant.e.j.tt r1 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ts r1 = (com.google.assistant.p3897e.p3921j.C52491ts) r1
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r8.f89143i
            com.google.assistant.e.j.e.ff r2 = r2.mo38576a()
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            r2.getClass()
            r3.f137806b = r2
            int r2 = r3.f137805a
            r2 = r2 | r4
            r3.f137805a = r2
            com.google.assistant.e.j.uh r2 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ug r2 = (com.google.assistant.p3897e.p3921j.C52506ug) r2
            r2.mo53877a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.j.tt r0 = (com.google.assistant.p3897e.p3921j.C52492tt) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.uh r2 = (com.google.assistant.p3897e.p3921j.C52507uh) r2
            r2.getClass()
            r0.f137807c = r2
            int r2 = r0.f137805a
            r2 = r2 | 2
            r0.f137805a = r2
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.tt r0 = (com.google.assistant.p3897e.p3921j.C52492tt) r0
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r8.f89144j
            com.google.assistant.e.c.c.dg r9 = r9.f132884e
            if (r9 != 0) goto L_0x01a8
            com.google.assistant.e.c.c.dg r9 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01a8:
            java.lang.String r2 = "FA Location"
            r1.mo38364a(r2, r0, r9)
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.LocationSelectionField.mo38714h(com.google.assistant.e.c.c.dy):void");
    }

    /* renamed from: i */
    public final void mo38715i() {
        int i;
        C51941eu euVar = this.f89142h;
        if (euVar != null && this.f89146l != null && this.f89136b != null) {
            boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
            if (z) {
                i = C19391a.m36980a(getContext(), R.attr.colorError);
            } else if (this.f89141g) {
                i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
            } else {
                i = C19391a.m36980a(getContext(), R.attr.colorOnSurfaceVariant);
            }
            this.f89146l.setTextColor(i);
            if (this.f89136b.getChildAt(0) != null) {
                SpinnerComponent spinnerComponent = this.f89136b;
                spinnerComponent.mo38668c(spinnerComponent.getChildAt(0), z, this.f89141g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89146l = (TextView) findViewById(R.id.fa_location_selection_field_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.fa_location_selection_field_single_location_picker);
        linearLayout.getClass();
        this.f89137c = linearLayout;
        this.f89148n = (LinearLayout) findViewById(R.id.fa_location_selection_field_single_location_picker_image_container);
        this.f89147m = (ImageComponent) findViewById(R.id.fa_location_selection_field_single_location_picker_image);
        this.f89149o = (TextView) findViewById(R.id.fa_location_selection_field_single_location_picker_text);
        SpinnerComponent spinnerComponent = (SpinnerComponent) findViewById(R.id.fa_location_selection_field_location_list);
        spinnerComponent.getClass();
        this.f89136b = spinnerComponent;
        spinnerComponent.setFocusableInTouchMode(true);
        this.f89138d = new C33322ca(this, getContext());
        C33317bw bwVar = new C33317bw(this);
        this.f89150p = bwVar;
        SpinnerComponent spinnerComponent2 = this.f89136b;
        spinnerComponent2.f88973e = bwVar;
        spinnerComponent2.setOnFocusChangeListener(new C33318bx(this));
        this.f89136b.setOnTouchListener(new C33319by(this));
        this.f89137c.setOnClickListener(new C33320bz(this));
    }

    public LocationSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LocationSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
