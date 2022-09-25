package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.SpinnerComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c.C11323k;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51023dn;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51029dt;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ListField */
/* compiled from: PG */
public class ListField extends C11407n implements C11323k {

    /* renamed from: a */
    public static final C59071e f37003a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ListField");

    /* renamed from: b */
    public SpinnerComponent f37004b;

    /* renamed from: c */
    public int f37005c = -1;

    /* renamed from: d */
    private TextView f37006d;

    /* renamed from: e */
    private RadioGroup f37007e;

    /* renamed from: f */
    private ListView f37008f;

    /* renamed from: g */
    private LinearLayout f37009g;

    public ListField(Context context) {
        super(context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m27053e(com.google.assistant.p3897e.p3902c.p3907c.C51027dr r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            android.widget.LinearLayout r1 = r6.f37009g
            r2 = 2131432900(0x7f0b15c4, float:1.848757E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r1 = (com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent) r1
            int r2 = r7.f132854a
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 & r3
            r4 = 0
            if (r2 == 0) goto L_0x0025
            r1.setVisibility(r4)
            r2 = 1
            r1.f36858e = r2
            com.google.assistant.e.c.c.dc r2 = r7.f132864k
            if (r2 != 0) goto L_0x0021
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0021:
            r5 = 0
            r1.mo19786b(r2, r5)
        L_0x0025:
            if (r8 != 0) goto L_0x0028
            return
        L_0x0028:
            android.widget.LinearLayout r8 = r6.f37009g
            r1 = 2131432901(0x7f0b15c5, float:1.8487573E38)
            android.view.View r8 = r8.findViewById(r1)
            android.widget.TextView r8 = (android.widget.TextView) r8
            int r1 = r7.f132855b
            r2 = 2
            if (r1 != r2) goto L_0x0040
            java.lang.Object r7 = r7.f132856c
            java.lang.String r7 = (java.lang.String) r7
            r8.setText(r7)
            goto L_0x0093
        L_0x0040:
            r2 = 6
            if (r1 != r2) goto L_0x0093
            android.content.Context r1 = r6.getContext()     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006d }
            int r5 = r7.f132855b     // Catch:{ NameNotFoundException -> 0x006d }
            if (r5 != r2) goto L_0x0054
            java.lang.Object r5 = r7.f132856c     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x0055
        L_0x0054:
            r5 = r0
        L_0x0055:
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.Context r3 = r6.getContext()     // Catch:{ NameNotFoundException -> 0x006d }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.CharSequence r1 = r3.getApplicationLabel(r1)     // Catch:{ NameNotFoundException -> 0x006d }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x006d }
            r8.setText(r1)     // Catch:{ NameNotFoundException -> 0x006d }
            goto L_0x0093
        L_0x006d:
            r1 = move-exception
            com.google.common.f.e r3 = f37003a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r1 = r3.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r3 = 43268(0xa904, float:6.0631E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            int r3 = r7.f132855b
            if (r3 != r2) goto L_0x008e
            java.lang.Object r7 = r7.f132856c
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
        L_0x008e:
            java.lang.String r7 = "Invalid package name: %s"
            r1.mo56389s(r7, r0)
        L_0x0093:
            java.lang.CharSequence r7 = r8.getText()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00a0
            r8.setVisibility(r4)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ListField.m27053e(com.google.assistant.e.c.c.dr, boolean):void");
    }

    /* renamed from: a */
    public final void mo19758a(C51027dr drVar, int i) {
        mo19856c(drVar, i);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51030du duVar;
        int a;
        if (this.f37153l != null && this.f37154m != null && this.f37152k != null) {
            this.f37004b.setVisibility(8);
            this.f37007e.setVisibility(8);
            this.f37007e.removeAllViews();
            ListView listView = this.f37008f;
            if (listView != null) {
                listView.setVisibility(8);
            }
            LinearLayout linearLayout = this.f37009g;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            C51941eu euVar = this.f37153l.f36729a;
            if (euVar.f136277e == 6) {
                duVar = (C51030du) euVar.f136278f;
            } else {
                duVar = C51030du.f132868g;
            }
            this.f37006d.setText(duVar.f132871b);
            C62971cq<C51027dr> cqVar = duVar.f132875f;
            int a2 = C51029dt.m86016a(duVar.f132872c);
            if (a2 != 0) {
                int i = 2;
                if (a2 == 2) {
                    int i2 = duVar.f132873d;
                    int a3 = C51023dn.m86015a(i2);
                    float f = 1.0f;
                    int i3 = -2;
                    int i4 = R.attr.fluid_actions_list_selection_field_radio_group_item_text_color;
                    if (a3 == 0 || a3 == 1 || ((a = C51023dn.m86015a(i2)) != 0 && a == 3)) {
                        for (C51027dr drVar : cqVar) {
                            RadioButton radioButton = new RadioButton(new ContextThemeWrapper(getContext(), R.style.list_selection_field_radio_style));
                            radioButton.setId(drVar.hashCode());
                            radioButton.setText(drVar.f132855b == i ? (String) drVar.f132856c : BuildConfig.FLAVOR);
                            radioButton.setOnClickListener(new C11371bd(this, drVar, cqVar));
                            radioButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
                            radioButton.setTextColor(C11307e.m26908a(this.f37159r, R.attr.fluid_actions_list_selection_field_radio_group_item_text_color));
                            radioButton.setChecked(false);
                            int[][] iArr = new int[i][];
                            iArr[0] = new int[]{-16842912};
                            iArr[1] = new int[]{16842912};
                            int[] iArr2 = new int[i];
                            iArr2[0] = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_list_selection_field_radio_group_item_text_color);
                            iArr2[1] = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_highlight_color);
                            radioButton.setButtonTintList(new ColorStateList(iArr, iArr2));
                            this.f37007e.addView(radioButton);
                            if (drVar.f132859f) {
                                this.f37007e.check(radioButton.getId());
                            }
                            i = 2;
                        }
                        this.f37007e.setVisibility(0);
                    } else {
                        int a4 = C51023dn.m86015a(i2);
                        int i5 = 5;
                        if (a4 != 0 && a4 == 6) {
                            for (C51027dr drVar2 : cqVar) {
                                RadioButton radioButton2 = new RadioButton(new ContextThemeWrapper(getContext(), R.style.list_selection_field_vertical_radio_style));
                                radioButton2.setId(drVar2.hashCode());
                                String str = drVar2.f132855b == 2 ? (String) drVar2.f132856c : BuildConfig.FLAVOR;
                                if ((drVar2.f132854a & 16) != 0) {
                                    str = str.concat("\n").concat(drVar2.f132861h);
                                    radioButton2.setMaxLines(2);
                                    radioButton2.setEllipsize(TextUtils.TruncateAt.END);
                                }
                                radioButton2.setText(str);
                                radioButton2.setOnClickListener(new C11370bc(this, drVar2, cqVar));
                                if ((drVar2.f132854a & 2048) != 0) {
                                    C28292j jVar = new C28292j(drVar2.f132865l);
                                    jVar.mo33795i(i5);
                                    jVar.mo33795i(4);
                                    C28295m.m52919e(radioButton2, jVar);
                                    int i6 = drVar2.f132865l;
                                }
                                radioButton2.setLayoutParams(new LinearLayout.LayoutParams(-1, i3, f));
                                radioButton2.setTextColor(C11307e.m26908a(this.f37159r, i4));
                                radioButton2.setChecked(false);
                                radioButton2.setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{C11307e.m26908a(this.f37159r, i4), C11307e.m26908a(this.f37159r, R.attr.fluid_actions_highlight_color)}));
                                this.f37007e.addView(radioButton2);
                                if (drVar2.f132859f) {
                                    this.f37007e.check(radioButton2.getId());
                                }
                                i5 = 5;
                                f = 1.0f;
                                i3 = -2;
                                i4 = R.attr.fluid_actions_list_selection_field_radio_group_item_text_color;
                            }
                            this.f37007e.setVisibility(0);
                        } else {
                            int a5 = C51023dn.m86015a(i2);
                            if (a5 != 0 && a5 == 2) {
                                Iterator it = cqVar.iterator();
                                int i7 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i7 = -1;
                                        break;
                                    }
                                    C51027dr drVar3 = (C51027dr) it.next();
                                    if ((drVar3.f132854a & 1) != 0 && drVar3.f132859f) {
                                        break;
                                    }
                                    i7++;
                                }
                                this.f37005c = i7;
                                if (i7 != -1) {
                                    C51027dr[] drVarArr = (C51027dr[]) cqVar.toArray(new C51027dr[cqVar.size()]);
                                    this.f37004b.setAdapter((SpinnerAdapter) new C11375bh(this, getContext(), drVarArr));
                                    this.f37004b.setVisibility(0);
                                    this.f37004b.setSelection(this.f37005c);
                                    this.f37004b.setOnItemSelectedListener(new C11372be(this, drVarArr));
                                }
                            } else {
                                int a6 = C51023dn.m86015a(i2);
                                if (a6 != 0 && a6 == 4) {
                                    this.f37006d.setVisibility(8);
                                    C51027dr[] drVarArr2 = (C51027dr[]) cqVar.toArray(new C51027dr[cqVar.size()]);
                                    this.f37008f.setAdapter(new C11376bi(getContext(), drVarArr2));
                                    this.f37008f.setVisibility(0);
                                    this.f37008f.setOnItemClickListener(new C11373bf(this, drVarArr2));
                                } else {
                                    int a7 = C51023dn.m86015a(i2);
                                    if (a7 != 0 && a7 == 5) {
                                        this.f37006d.setVisibility(8);
                                        this.f37009g.setVisibility(0);
                                        boolean z = this.f37160s == 2;
                                        C51027dr drVar4 = duVar.f132874e;
                                        if (drVar4 == null) {
                                            drVar4 = C51027dr.f132852m;
                                        }
                                        m27053e(drVar4, z);
                                        this.f37009g.setClickable(false);
                                        if (!z && duVar.f132875f.size() >= 2) {
                                            this.f37009g.setClickable(true);
                                            this.f37009g.setOnClickListener(new C11374bg(this, duVar));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    mo19857d();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r11v13, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19856c(com.google.assistant.p3897e.p3902c.p3907c.C51027dr r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.protobuf.bn r2 = r17.toBuilder()
            com.google.assistant.e.c.c.do r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.c.c.dr r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r3
            int r4 = r3.f132854a
            r5 = 1
            r4 = r4 | r5
            r3.f132854a = r4
            r3.f132859f = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.dr r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r2
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r3 = r0.f37153l
            r4 = 2
            r6 = 4
            r7 = 0
            if (r3 != 0) goto L_0x0028
            goto L_0x016d
        L_0x0028:
            com.google.assistant.e.j.e.eu r3 = r3.f36729a
            int r8 = r3.f136277e
            r9 = 6
            if (r8 != r9) goto L_0x0034
            java.lang.Object r8 = r3.f136278f
            com.google.assistant.e.c.c.du r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r8
            goto L_0x0036
        L_0x0034:
            com.google.assistant.e.c.c.du r8 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0036:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.e.c.c.dl r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51021dl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.du r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r10
            r2.getClass()
            r10.f132874e = r2
            int r11 = r10.f132870a
            r11 = r11 | 16
            r10.f132870a = r11
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.du r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r10
            com.google.protobuf.cq r11 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.emptyProtobufList()
            r10.f132875f = r11
            int r10 = r3.f136277e
            if (r10 != r9) goto L_0x0064
            java.lang.Object r10 = r3.f136278f
            com.google.assistant.e.c.c.du r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r10
            goto L_0x0066
        L_0x0064:
            com.google.assistant.e.c.c.du r10 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x0066:
            com.google.protobuf.cq r10 = r10.f132875f
            java.util.Iterator r10 = r10.iterator()
        L_0x006c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00d0
            java.lang.Object r11 = r10.next()
            com.google.assistant.e.c.c.dr r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r11
            com.google.protobuf.bn r12 = r11.toBuilder()
            com.google.assistant.e.c.c.do r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r12
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.assistant.e.c.c.do r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.assistant.e.c.c.dr r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r13
            int r14 = r13.f132854a
            r14 = r14 | r5
            r13.f132854a = r14
            r13.f132859f = r7
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.c.c.dr r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r11
            com.google.protobuf.bn r13 = r17.toBuilder()
            com.google.assistant.e.c.c.do r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.e.c.c.dr r14 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r14
            int r15 = r14.f132854a
            r15 = r15 | r5
            r14.f132854a = r15
            r14.f132859f = r7
            com.google.protobuf.bv r13 = r13.build()
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto L_0x00be
            com.google.protobuf.bn r11 = r2.toBuilder()
            r12 = r11
            com.google.assistant.e.c.c.do r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r12
            goto L_0x00cc
        L_0x00be:
            r12.copyOnWrite()
            com.google.protobuf.bv r11 = r12.instance
            com.google.assistant.e.c.c.dr r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r11
            int r13 = r11.f132854a
            r13 = r13 | r5
            r11.f132854a = r13
            r11.f132859f = r7
        L_0x00cc:
            r8.mo53503d(r12)
            goto L_0x006c
        L_0x00d0:
            com.google.protobuf.bn r2 = r3.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.du r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r8
            r8.getClass()
            r3.f136278f = r8
            r3.f136277e = r9
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.assistant.e.j.tr r3 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.tp r3 = (com.google.assistant.p3897e.p3921j.C52488tp) r3
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r8 = r0.f37153l
            com.google.assistant.e.j.e.eu r8 = r8.f36729a
            java.lang.String r8 = r8.f136279g
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.j.tr r9 = (com.google.assistant.p3897e.p3921j.C52490tr) r9
            r8.getClass()
            int r10 = r9.f137797a
            r10 = r10 | r5
            r9.f137797a = r10
            r9.f137800d = r8
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r8 = r0.f37153l
            com.google.assistant.e.j.e.eu r8 = r8.f36729a
            java.lang.String r8 = r8.f136280h
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.j.tr r9 = (com.google.assistant.p3897e.p3921j.C52490tr) r9
            r8.getClass()
            int r10 = r9.f137797a
            r10 = r10 | r4
            r9.f137797a = r10
            r9.f137801e = r8
            r3.copyOnWrite()
            com.google.protobuf.bv r8 = r3.instance
            com.google.assistant.e.j.tr r8 = (com.google.assistant.p3897e.p3921j.C52490tr) r8
            int r9 = r8.f137797a
            r9 = r9 | r6
            r8.f137797a = r9
            r8.f137802f = r5
            com.google.assistant.e.j.tv r8 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.tu r8 = (com.google.assistant.p3897e.p3921j.C52493tu) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.tv r9 = (com.google.assistant.p3897e.p3921j.C52494tv) r9
            int r10 = r9.f137811a
            r10 = r10 | r5
            r9.f137811a = r10
            r10 = r18
            long r10 = (long) r10
            r9.f137812b = r10
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.j.tr r9 = (com.google.assistant.p3897e.p3921j.C52490tr) r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.tv r8 = (com.google.assistant.p3897e.p3921j.C52494tv) r8
            r8.getClass()
            r9.f137799c = r8
            r9.f137798b = r6
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.tr r3 = (com.google.assistant.p3897e.p3921j.C52490tr) r3
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r8 = r0.f37153l
            r8.f36730b = r3
            r8.f36729a = r2
        L_0x016d:
            android.widget.LinearLayout r2 = r0.f37009g
            if (r2 == 0) goto L_0x017f
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x017f
            int r2 = r0.f37160s
            if (r2 != r4) goto L_0x017c
            r7 = 1
        L_0x017c:
            r0.m27053e(r1, r7)
        L_0x017f:
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r0.f37153l
            if (r2 == 0) goto L_0x01b8
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r3 = r0.f37154m
            if (r3 != 0) goto L_0x0188
            goto L_0x01b8
        L_0x0188:
            com.google.android.libraries.assistant.assistantactions.rendering.c.f r2 = r3.mo19691a(r2)
            int r3 = r1.f132857d
            r4 = 8
            if (r3 != r4) goto L_0x01a0
            java.lang.Object r1 = r1.f132858e
            com.google.assistant.e.c.c.dq r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51026dq) r1
            com.google.protobuf.cq r1 = r1.f132851a
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89842j(r1)
            r0.mo19940g(r1, r5)
            return
        L_0x01a0:
            if (r3 != r6) goto L_0x01aa
            java.lang.Object r1 = r1.f132858e
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            r0.mo19942i(r1, r2)
            return
        L_0x01aa:
            r4 = 7
            if (r3 != r4) goto L_0x01b5
            java.lang.Object r1 = r1.f132858e
            com.google.assistant.e.c.c.gh r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r1
            r0.mo19944l(r1)
            return
        L_0x01b5:
            r0.mo19941h(r2)
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ListField.mo19856c(com.google.assistant.e.c.c.dr, int):void");
    }

    /* renamed from: d */
    public final void mo19857d() {
        if (this.f37004b.getChildAt(0) != null && this.f37153l != null) {
            SpinnerComponent spinnerComponent = this.f37004b;
            spinnerComponent.mo19803c((TextView) spinnerComponent.getChildAt(0), this.f37153l.mo19717a(), this.f37151j);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37006d = (TextView) findViewById(R.id.list_field_title);
        this.f37007e = (RadioGroup) findViewById(R.id.radio_group);
        this.f37004b = (SpinnerComponent) findViewById(R.id.spinner_group);
        this.f37008f = (ListView) findViewById(R.id.vertical_view);
        this.f37009g = (LinearLayout) findViewById(R.id.list_item_picker_button);
    }

    /* renamed from: q */
    public final void mo19853q(boolean z) {
        this.f37151j = z;
        mo19857d();
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
}
