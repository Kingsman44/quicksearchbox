package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0516an;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.content.C1877c;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.NonScrollableLinearLayoutManager;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33251j;
import com.google.assistant.p3897e.p3902c.p3907c.C51023dn;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51029dt;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ListField */
/* compiled from: PG */
public final class ListField extends LinearLayout implements C33177b, C33251j {

    /* renamed from: a */
    public static final C59071e f89122a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ListField");

    /* renamed from: b */
    public SpinnerComponent f89123b = null;

    /* renamed from: c */
    public int f89124c = -1;

    /* renamed from: d */
    public boolean f89125d = false;

    /* renamed from: e */
    C51941eu f89126e;

    /* renamed from: f */
    public C33184i f89127f;

    /* renamed from: g */
    public C33182g f89128g;

    /* renamed from: h */
    public C32942a f89129h;

    /* renamed from: i */
    public Fragment f89130i;

    /* renamed from: j */
    private TextView f89131j = null;

    /* renamed from: k */
    private RadioGroup f89132k = null;

    /* renamed from: l */
    private RecyclerView f89133l = null;

    /* renamed from: m */
    private LinearLayout f89134m = null;

    public ListField(Context context) {
        super(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m61794i(com.google.assistant.p3897e.p3902c.p3907c.C51027dr r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            android.widget.LinearLayout r1 = r7.f89134m
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            r2 = 2131430780(0x7f0b0d7c, float:1.848327E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.ImageComponent r1 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent) r1
            r2 = 0
            r3 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002a
            int r4 = r8.f132854a
            r4 = r4 & r3
            if (r4 == 0) goto L_0x002a
            r1.setVisibility(r2)
            r4 = 1
            r1.f88960e = r4
            com.google.assistant.e.c.c.dc r4 = r8.f132864k
            if (r4 != 0) goto L_0x0026
            com.google.assistant.e.c.c.dc r4 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0026:
            r5 = 0
            r1.mo38649b(r4, r5)
        L_0x002a:
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.i r1 = r7.f89127f
            if (r1 == 0) goto L_0x00af
            boolean r1 = r1.f88753c
            if (r1 != 0) goto L_0x0034
            goto L_0x00af
        L_0x0034:
            android.widget.LinearLayout r1 = r7.f89134m
            r4 = 2131430781(0x7f0b0d7d, float:1.8483273E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x0042
            return
        L_0x0042:
            int r4 = r8.f132855b
            r5 = 2
            if (r4 != r5) goto L_0x004f
            java.lang.Object r8 = r8.f132856c
            java.lang.String r8 = (java.lang.String) r8
            r1.setText(r8)
            goto L_0x00a2
        L_0x004f:
            r5 = 6
            if (r4 != r5) goto L_0x00a2
            android.content.Context r4 = r7.getContext()     // Catch:{ NameNotFoundException -> 0x007c }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007c }
            int r6 = r8.f132855b     // Catch:{ NameNotFoundException -> 0x007c }
            if (r6 != r5) goto L_0x0063
            java.lang.Object r6 = r8.f132856c     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NameNotFoundException -> 0x007c }
            goto L_0x0064
        L_0x0063:
            r6 = r0
        L_0x0064:
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r6, r3)     // Catch:{ NameNotFoundException -> 0x007c }
            android.content.Context r4 = r7.getContext()     // Catch:{ NameNotFoundException -> 0x007c }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.CharSequence r3 = r4.getApplicationLabel(r3)     // Catch:{ NameNotFoundException -> 0x007c }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x007c }
            r1.setText(r3)     // Catch:{ NameNotFoundException -> 0x007c }
            goto L_0x00a2
        L_0x007c:
            r3 = move-exception
            com.google.common.f.e r4 = f89122a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r3 = r4.mo56382g(r3)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 51093(0xc795, float:7.1597E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            int r4 = r8.f132855b
            if (r4 != r5) goto L_0x009d
            java.lang.Object r8 = r8.f132856c
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
        L_0x009d:
            java.lang.String r8 = "Invalid package name: %s"
            r3.mo56389s(r8, r0)
        L_0x00a2:
            java.lang.CharSequence r8 = r1.getText()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x00af
            r1.setVisibility(r2)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ListField.m61794i(com.google.assistant.e.c.c.dr):void");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final void mo38563d(boolean z) {
        this.f89125d = z;
        mo38712h();
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51030du duVar;
        TextView textView;
        C51941eu euVar = this.f89126e;
        if (euVar == null || this.f89128g == null || this.f89131j == null || this.f89132k == null || this.f89123b == null) {
            ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51094)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89126e = euVar2;
            this.f89128g.mo38581f(euVar2);
        }
        this.f89123b.setVisibility(8);
        this.f89132k.setVisibility(8);
        this.f89132k.removeAllViews();
        RecyclerView recyclerView = this.f89133l;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f89134m;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        C51941eu euVar3 = this.f89126e;
        if (euVar3.f136277e == 6) {
            duVar = (C51030du) euVar3.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        int i = 1;
        if ((duVar.f132870a & 1) != 0) {
            this.f89131j.setText(duVar.f132871b);
        } else {
            this.f89131j.setVisibility(8);
        }
        C62971cq<C51027dr> cqVar = duVar.f132875f;
        int a = C51029dt.m86016a(duVar.f132872c);
        if (a != 0) {
            int i2 = 2;
            if (a == 2) {
                int a2 = C51023dn.m86015a(duVar.f132873d);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 1;
                float f = 1.0f;
                int i4 = -2;
                AttributeSet attributeSet = null;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                TextView textView2 = this.f89131j;
                                if (textView2 == null || this.f89133l == null) {
                                    ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51101)).mo56386p("Unable to update FormField UI due to invalid args");
                                } else {
                                    textView2.setVisibility(8);
                                    this.f89133l.setAdapter(new C33316bv(this, cqVar));
                                    this.f89133l.setLayoutManager(new NonScrollableLinearLayoutManager(getContext()));
                                    C0569cl clVar = new C0569cl(getContext(), 1);
                                    Drawable a3 = C1877c.m5125a(getContext(), R.drawable.fa_contact_item_grey_divider);
                                    a3.getClass();
                                    clVar.f2212a = a3;
                                    this.f89133l.addItemDecoration$ar$ds(clVar);
                                    this.f89133l.setVisibility(0);
                                }
                            } else if (i3 != 5) {
                                TextView textView3 = this.f89131j;
                                if (textView3 == null || this.f89134m == null || this.f89127f == null) {
                                    ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51096)).mo56386p("Unable to update FormField UI due to invalid args");
                                } else {
                                    textView3.setVisibility(8);
                                    this.f89134m.setVisibility(0);
                                    C51027dr drVar = duVar.f132874e;
                                    if (drVar == null) {
                                        drVar = C51027dr.f132852m;
                                    }
                                    m61794i(drVar);
                                    this.f89134m.setClickable(false);
                                    if (!this.f89127f.f88753c && duVar.f132875f.size() >= 2) {
                                        this.f89134m.setClickable(true);
                                        this.f89134m.setOnClickListener(new C33310bp(this, duVar));
                                    }
                                }
                            } else if (this.f89132k == null) {
                                ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51100)).mo56386p("Unable to update FormField UI due to invalid args");
                            } else {
                                for (C51027dr drVar2 : cqVar) {
                                    C0516an anVar = new C0516an(new ContextThemeWrapper(getContext(), C33234l.m61647e(getContext(), R.attr.fa_list_field_vertical_radio_button_style)), (AttributeSet) null);
                                    anVar.setId(drVar2.hashCode());
                                    String str = drVar2.f132855b == 2 ? (String) drVar2.f132856c : BuildConfig.FLAVOR;
                                    if ((drVar2.f132854a & 16) != 0) {
                                        str = str.concat("\n").concat(drVar2.f132861h);
                                        anVar.setMaxLines(2);
                                        anVar.setEllipsize(TextUtils.TruncateAt.END);
                                    }
                                    anVar.setText(str);
                                    anVar.setOnClickListener(new C33309bo(this, drVar2, cqVar));
                                    anVar.setLayoutParams(new LinearLayout.LayoutParams(-1, i4, f));
                                    anVar.setChecked(false);
                                    anVar.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C19391a.m36980a(getContext(), R.attr.colorOnSurface), C19391a.m36980a(getContext(), R.attr.colorPrimary)}));
                                    this.f89132k.addView(anVar);
                                    if (drVar2.f132859f) {
                                        this.f89132k.check(anVar.getId());
                                    }
                                    f = 1.0f;
                                    i4 = -2;
                                }
                                this.f89132k.setVisibility(0);
                            }
                        }
                    } else if (this.f89123b == null) {
                        ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51098)).mo56386p("Unable to update FormField UI due to invalid args");
                    } else {
                        Iterator it = cqVar.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i5 = -1;
                                break;
                            }
                            C51027dr drVar3 = (C51027dr) it.next();
                            if ((drVar3.f132854a & 1) != 0 && drVar3.f132859f) {
                                break;
                            }
                            i5++;
                        }
                        this.f89124c = i5;
                        if (i5 != -1) {
                            C51027dr[] drVarArr = (C51027dr[]) cqVar.toArray(new C51027dr[0]);
                            this.f89123b.setAdapter((SpinnerAdapter) new C33313bs(this, getContext(), drVarArr));
                            this.f89123b.setVisibility(0);
                            this.f89123b.setSelection(this.f89124c);
                            this.f89123b.setOnItemSelectedListener(new C33312br(this, drVarArr));
                        }
                    }
                    mo38712h();
                    return;
                }
                if (this.f89132k == null || (textView = this.f89131j) == null) {
                    ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51097)).mo56386p("Unable to update FormField UI due to invalid args");
                    mo38712h();
                    return;
                }
                if (textView.length() == 0) {
                    this.f89131j.setVisibility(8);
                }
                for (C51027dr drVar4 : cqVar) {
                    C0516an anVar2 = new C0516an(new ContextThemeWrapper(getContext(), C33234l.m61647e(getContext(), R.attr.fa_list_field_radio_button_style)), attributeSet);
                    anVar2.setId(drVar4.hashCode());
                    anVar2.setText(drVar4.f132855b == i2 ? (String) drVar4.f132856c : BuildConfig.FLAVOR);
                    anVar2.setOnClickListener(new C33311bq(this, drVar4, cqVar));
                    anVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
                    anVar2.setChecked(false);
                    int[][] iArr = new int[i2][];
                    iArr[0] = new int[]{-16842912};
                    iArr[1] = new int[]{16842912};
                    int[] iArr2 = new int[i2];
                    iArr2[0] = C19391a.m36980a(getContext(), R.attr.colorOnSurface);
                    iArr2[1] = C19391a.m36980a(getContext(), R.attr.colorPrimary);
                    anVar2.setButtonTintList(new ColorStateList(iArr, iArr2));
                    this.f89132k.addView(anVar2);
                    if (drVar4.f132859f) {
                        this.f89132k.check(anVar2.getId());
                    }
                    i2 = 2;
                    attributeSet = null;
                }
                this.f89132k.setVisibility(0);
                mo38712h();
                return;
            }
        }
        C59052c cVar = (C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51095);
        int a4 = C51029dt.m86016a(duVar.f132872c);
        if (a4 != 0) {
            i = a4;
        }
        cVar.mo56387q("Failed to render ListField dut to unsupported select type: %d", i - 1);
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* renamed from: h */
    public final void mo38712h() {
        SpinnerComponent spinnerComponent;
        C51941eu euVar = this.f89126e;
        if (euVar == null || (spinnerComponent = this.f89123b) == null) {
            ((C59052c) ((C59052c) f89122a.mo56226d()).mo56372aa(51099)).mo56386p("Failed to update UI color due to invalid args");
            return;
        }
        boolean z = (euVar.f136273a & 64) != 0 && euVar.f136282j;
        if (spinnerComponent.getChildAt(0) != null) {
            SpinnerComponent spinnerComponent2 = this.f89123b;
            spinnerComponent2.mo38668c(spinnerComponent2.getChildAt(0), z, this.f89125d);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89131j = (TextView) findViewById(R.id.fa_list_field_title);
        this.f89132k = (RadioGroup) findViewById(R.id.fa_list_field_radio_group);
        this.f89123b = (SpinnerComponent) findViewById(R.id.fa_list_field_spinner_group);
        this.f89133l = (RecyclerView) findViewById(R.id.fa_list_field_vertical_view);
        this.f89134m = (LinearLayout) findViewById(R.id.fa_list_field_list_item_picker_button);
    }

    public ListField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* JADX WARNING: type inference failed for: r12v22, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r5v18, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38711a(com.google.assistant.p3897e.p3902c.p3907c.C51027dr r12, int r13) {
        /*
            r11 = this;
            com.google.assistant.e.j.e.eu r0 = r11.f89126e
            r1 = 1
            if (r0 == 0) goto L_0x00f9
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r11.f89128g
            if (r0 != 0) goto L_0x000b
            goto L_0x00f9
        L_0x000b:
            com.google.protobuf.bn r0 = r12.toBuilder()
            com.google.assistant.e.c.c.do r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.c.c.dr r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r2
            int r3 = r2.f132854a
            r3 = r3 | r1
            r2.f132854a = r3
            r2.f132859f = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dr r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r0
            com.google.assistant.e.j.e.eu r2 = r11.f89126e
            int r3 = r2.f136277e
            r4 = 6
            if (r3 != r4) goto L_0x0031
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.du r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r2
            goto L_0x0033
        L_0x0031:
            com.google.assistant.e.c.c.du r2 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0033:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.c.c.dl r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51021dl) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.du r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r3
            r0.getClass()
            r3.f132874e = r0
            int r5 = r3.f132870a
            r5 = r5 | 16
            r3.f132870a = r5
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.du r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r3
            com.google.protobuf.cq r5 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.emptyProtobufList()
            r3.f132875f = r5
            com.google.assistant.e.j.e.eu r3 = r11.f89126e
            int r5 = r3.f136277e
            if (r5 != r4) goto L_0x0063
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.du r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r3
            goto L_0x0065
        L_0x0063:
            com.google.assistant.e.c.c.du r3 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0065:
            com.google.protobuf.cq r3 = r3.f132875f
            java.util.Iterator r3 = r3.iterator()
        L_0x006b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.c.c.dr r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r5
            com.google.protobuf.bn r6 = r5.toBuilder()
            com.google.assistant.e.c.c.do r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r6
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.c.c.do r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.e.c.c.dr r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r7
            int r8 = r7.f132854a
            r8 = r8 | r1
            r7.f132854a = r8
            r8 = 0
            r7.f132859f = r8
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.c.c.dr r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r5
            com.google.protobuf.bn r7 = r12.toBuilder()
            com.google.assistant.e.c.c.do r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.c.c.dr r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r9
            int r10 = r9.f132854a
            r10 = r10 | r1
            r9.f132854a = r10
            r9.f132859f = r8
            com.google.protobuf.bv r7 = r7.build()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00be
            com.google.protobuf.bn r5 = r0.toBuilder()
            r6 = r5
            com.google.assistant.e.c.c.do r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r6
            goto L_0x00cc
        L_0x00be:
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.dr r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r5
            int r7 = r5.f132854a
            r7 = r7 | r1
            r5.f132854a = r7
            r5.f132859f = r8
        L_0x00cc:
            r2.mo53503d(r6)
            goto L_0x006b
        L_0x00d0:
            com.google.assistant.e.j.e.eu r0 = r11.f89126e
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.du r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r2
            r2.getClass()
            r3.f136278f = r2
            r3.f136277e = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r11.f89126e = r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r11.f89128g
            r2.mo38581f(r0)
        L_0x00f9:
            android.widget.LinearLayout r0 = r11.f89134m
            if (r0 == 0) goto L_0x0106
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0106
            r11.m61794i(r12)
        L_0x0106:
            com.google.assistant.e.j.e.eu r0 = r11.f89126e
            if (r0 == 0) goto L_0x02a1
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r0 = r11.f89128g
            if (r0 == 0) goto L_0x02a1
            com.google.android.libraries.search.assistant.fluidactions.a.a r0 = r11.f89129h
            if (r0 == 0) goto L_0x02a1
            android.support.v4.app.Fragment r0 = r11.f89130i
            if (r0 != 0) goto L_0x0118
            goto L_0x02a1
        L_0x0118:
            com.google.assistant.e.j.tr r0 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.tp r0 = (com.google.assistant.p3897e.p3921j.C52488tp) r0
            com.google.assistant.e.j.e.eu r2 = r11.f89126e
            java.lang.String r2 = r2.f136279g
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            r2.getClass()
            int r4 = r3.f137797a
            r4 = r4 | r1
            r3.f137797a = r4
            r3.f137800d = r2
            com.google.assistant.e.j.e.eu r2 = r11.f89126e
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
            r4 = 4
            r3 = r3 | r4
            r2.f137797a = r3
            r2.f137802f = r1
            com.google.assistant.e.j.tv r2 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.tu r2 = (com.google.assistant.p3897e.p3921j.C52493tu) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.tv r3 = (com.google.assistant.p3897e.p3921j.C52494tv) r3
            int r5 = r3.f137811a
            r5 = r5 | r1
            r3.f137811a = r5
            long r5 = (long) r13
            r3.f137812b = r5
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.assistant.e.j.tr r13 = (com.google.assistant.p3897e.p3921j.C52490tr) r13
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.tv r2 = (com.google.assistant.p3897e.p3921j.C52494tv) r2
            r2.getClass()
            r13.f137799c = r2
            r13.f137798b = r4
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.tr r13 = (com.google.assistant.p3897e.p3921j.C52490tr) r13
            com.google.assistant.e.j.tt r0 = com.google.assistant.p3897e.p3921j.C52492tt.f137803d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ts r0 = (com.google.assistant.p3897e.p3921j.C52491ts) r0
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = r11.f89128g
            com.google.assistant.e.j.e.ff r2 = r2.mo38576a()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.assistant.e.j.tt r3 = (com.google.assistant.p3897e.p3921j.C52492tt) r3
            r2.getClass()
            r3.f137806b = r2
            int r2 = r3.f137805a
            r2 = r2 | r1
            r3.f137805a = r2
            com.google.assistant.e.j.uh r2 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ug r2 = (com.google.assistant.p3897e.p3921j.C52506ug) r2
            r2.mo53877a(r13)
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.assistant.e.j.tt r13 = (com.google.assistant.p3897e.p3921j.C52492tt) r13
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.uh r2 = (com.google.assistant.p3897e.p3921j.C52507uh) r2
            r2.getClass()
            r13.f137807c = r2
            int r2 = r13.f137805a
            r2 = r2 | 2
            r13.f137805a = r2
            com.google.protobuf.bv r13 = r0.build()
            com.google.assistant.e.j.tt r13 = (com.google.assistant.p3897e.p3921j.C52492tt) r13
            int r0 = r12.f132857d
            r2 = 8
            if (r0 != r2) goto L_0x0278
            com.google.assistant.e.j.e.eu r0 = r11.f89126e
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.j.e.eq r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r0
            com.google.assistant.e.j.e.et r3 = com.google.assistant.p3897e.p3921j.p3926e.C51940et.f136268b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.e.es r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51939es) r3
            int r4 = r12.f132857d
            if (r4 != r2) goto L_0x01f2
            java.lang.Object r12 = r12.f132858e
            com.google.assistant.e.c.c.dq r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51026dq) r12
            goto L_0x01f4
        L_0x01f2:
            com.google.assistant.e.c.c.dq r12 = com.google.assistant.p3897e.p3902c.p3907c.C51026dq.f132849b
        L_0x01f4:
            com.google.protobuf.cq r12 = r12.f132851a
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.assistant.e.j.e.et r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51940et) r2
            com.google.protobuf.cq r4 = r2.f136270a
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x020b
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r2.f136270a = r4
        L_0x020b:
            com.google.protobuf.cq r2 = r2.f136270a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r12, (java.util.List) r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            com.google.protobuf.bv r2 = r3.build()
            com.google.assistant.e.j.e.et r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51940et) r2
            r2.getClass()
            r12.f136276d = r2
            r2 = 24
            r12.f136275c = r2
            com.google.protobuf.bv r12 = r0.build()
            com.google.assistant.e.j.e.eu r12 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r12
            com.google.android.libraries.search.assistant.fluidactions.a.a r0 = r11.f89129h
            int r2 = r13.f137805a
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0264
            com.google.android.libraries.search.assistant.fluidactions.rendering.a.g r2 = new com.google.android.libraries.search.assistant.fluidactions.rendering.a.g
            com.google.assistant.e.j.e.ff r3 = r13.f137806b
            if (r3 != 0) goto L_0x023b
            com.google.assistant.e.j.e.ff r3 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x023b:
            r2.<init>(r3)
            r2.mo38581f(r12)
            com.google.protobuf.bn r12 = r13.toBuilder()
            com.google.assistant.e.j.ts r12 = (com.google.assistant.p3897e.p3921j.C52491ts) r12
            com.google.assistant.e.j.e.ff r13 = r2.mo38576a()
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.assistant.e.j.tt r2 = (com.google.assistant.p3897e.p3921j.C52492tt) r2
            r13.getClass()
            r2.f137806b = r13
            int r13 = r2.f137805a
            r13 = r13 | r1
            r2.f137805a = r13
            com.google.protobuf.bv r12 = r12.build()
            r13 = r12
            com.google.assistant.e.j.tt r13 = (com.google.assistant.p3897e.p3921j.C52492tt) r13
            goto L_0x0272
        L_0x0264:
            com.google.common.f.e r12 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h.f88865a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r1 = "Unable to update FormInput with FormField"
            r2 = 51174(0xc7e6, float:7.171E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r2)).mo56386p(r1)
        L_0x0272:
            java.lang.String r12 = "FA List"
            r0.mo38366c(r12, r13)
            return
        L_0x0278:
            r1 = 7
            if (r0 != r1) goto L_0x0290
            android.content.Context r13 = r11.getContext()
            android.support.v4.app.Fragment r0 = r11.f89130i
            int r2 = r12.f132857d
            if (r2 != r1) goto L_0x028a
            java.lang.Object r12 = r12.f132858e
            com.google.assistant.e.c.c.gh r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r12
            goto L_0x028c
        L_0x028a:
            com.google.assistant.e.c.c.gh r12 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x028c:
            com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33230h.m61622d(r13, r0, r12)
            return
        L_0x0290:
            com.google.android.libraries.search.assistant.fluidactions.a.a r1 = r11.f89129h
            if (r0 != r4) goto L_0x0299
            java.lang.Object r12 = r12.f132858e
            com.google.assistant.e.c.c.dg r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r12
            goto L_0x029b
        L_0x0299:
            com.google.assistant.e.c.c.dg r12 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x029b:
            java.lang.String r0 = "FA List Interactive"
            r1.mo38364a(r0, r13, r12)
            return
        L_0x02a1:
            com.google.common.f.e r12 = f89122a
            com.google.common.f.x r12 = r12.mo56226d()
            java.lang.String r13 = "Failed to handle user interaction due to invalid args"
            r0 = 51092(0xc794, float:7.1595E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56386p(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields.ListField.mo38711a(com.google.assistant.e.c.c.dr, int):void");
    }
}
