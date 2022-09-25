package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33217f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormMainView;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.protobuf.C62971cq;
import java.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.r */
/* compiled from: PG */
public final class C33204r {
    /* renamed from: a */
    public static final Context m61577a(Context context, C33182g gVar, C33184i iVar, C32951d dVar, C33217f fVar) {
        int i;
        if (fVar == C33217f.INTENT_PLATE) {
            i = iVar.f88753c ? 2132149030 : 2132149029;
        } else if (iVar.f88753c && dVar.mo38383m()) {
            C51936ep a = C51936ep.m86435a(gVar.mo38576a().f136323g);
            if (a == null) {
                a = C51936ep.DEFAULT;
            }
            C69664n.m101060f(a, "showNativeFormArgsHolder.get().featureType");
            C69664n.m101061g(a, "featureType");
            int ordinal = a.ordinal();
            i = (ordinal == 1 || ordinal == 2 || ordinal == 9 || ordinal == 10) ? 2132149053 : C33203q.m61575a(a);
        } else if (iVar.f88753c) {
            C51936ep a2 = C51936ep.m86435a(gVar.mo38576a().f136323g);
            if (a2 == null) {
                a2 = C51936ep.DEFAULT;
            }
            C69664n.m101060f(a2, "showNativeFormArgsHolder.get().featureType");
            C69664n.m101061g(a2, "featureType");
            int ordinal2 = a2.ordinal();
            i = (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 9 || ordinal2 == 10) ? 2132149067 : C33203q.m61576b(a2);
        } else if (dVar.mo38383m()) {
            if (dVar.mo38394w()) {
                C51936ep a3 = C51936ep.m86435a(gVar.mo38576a().f136323g);
                if (a3 == null) {
                    a3 = C51936ep.DEFAULT;
                }
                C69664n.m101060f(a3, "showNativeFormArgsHolder.get().featureType");
                C69664n.m101061g(a3, "featureType");
                int ordinal3 = a3.ordinal();
                if (ordinal3 == 1) {
                    i = 2132149056;
                } else if (ordinal3 == 2) {
                    i = 2132149057;
                } else if (ordinal3 != 18) {
                    switch (ordinal3) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 12:
                        case 14:
                            i = 2132149062;
                            break;
                        case 9:
                        case 10:
                            i = 2132149054;
                            break;
                        case 11:
                            i = 2132149055;
                            break;
                        case 13:
                            i = 2132149063;
                            break;
                        default:
                            i = 2132149050;
                            break;
                    }
                } else {
                    i = 2132149060;
                }
            } else {
                C51936ep a4 = C51936ep.m86435a(gVar.mo38576a().f136323g);
                if (a4 == null) {
                    a4 = C51936ep.DEFAULT;
                }
                C69664n.m101060f(a4, "showNativeFormArgsHolder.get().featureType");
                i = C33203q.m61575a(a4);
            }
        } else if (dVar.mo38394w()) {
            C51936ep a5 = C51936ep.m86435a(gVar.mo38576a().f136323g);
            if (a5 == null) {
                a5 = C51936ep.DEFAULT;
            }
            C69664n.m101060f(a5, "showNativeFormArgsHolder.get().featureType");
            C69664n.m101061g(a5, "featureType");
            int ordinal4 = a5.ordinal();
            if (ordinal4 == 1) {
                i = 2132149070;
            } else if (ordinal4 == 2) {
                i = 2132149071;
            } else if (ordinal4 != 18) {
                switch (ordinal4) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 12:
                    case 14:
                        i = 2132149076;
                        break;
                    case 9:
                    case 10:
                        i = 2132149068;
                        break;
                    case 11:
                        i = 2132149069;
                        break;
                    case 13:
                        i = 2132149077;
                        break;
                    default:
                        i = 2132149049;
                        break;
                }
            } else {
                i = 2132149074;
            }
        } else {
            C51936ep a6 = C51936ep.m86435a(gVar.mo38576a().f136323g);
            if (a6 == null) {
                a6 = C51936ep.DEFAULT;
            }
            C69664n.m101060f(a6, "showNativeFormArgsHolder.get().featureType");
            i = C33203q.m61576b(a6);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (C44534d.m78715b()) {
            if (dVar.mo38383m() || fVar == C33217f.INTENT_PLATE) {
                contextThemeWrapper.getTheme().applyStyle(2132150912, true);
            } else {
                contextThemeWrapper.getTheme().applyStyle(2132150627, true);
            }
        }
        if (dVar.mo38390t()) {
            contextThemeWrapper.getTheme().applyStyle(2132150628, true);
        }
        return contextThemeWrapper;
    }

    /* renamed from: b */
    public static final void m61578b(Context context, FormFieldGroupView formFieldGroupView, C51943ew ewVar) {
        C69664n.m101061g(formFieldGroupView, "view");
        C69664n.m101061g(ewVar, "formFieldGroup");
        if (ewVar.f136288b.size() > 0) {
            C62971cq<C51941eu> cqVar = ewVar.f136288b;
            C69664n.m101060f(cqVar, "formFieldGroup.formFieldList");
            if (!(cqVar instanceof Collection) || !cqVar.isEmpty()) {
                for (C51941eu euVar : cqVar) {
                    int i = euVar.f136277e;
                    if (i != 17 && i != 10) {
                        return;
                    }
                }
            }
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C33234l.m61647e(context, R.attr.fa_form_field_group_button_view_style), new int[]{16842927});
            C69664n.m101060f(obtainStyledAttributes, "context\n          .getTh…        attrs\n          )");
            formFieldGroupView.setGravity(obtainStyledAttributes.getInteger(0, 8388629));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j m61579c(android.content.Context r16, com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33218g r17, com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g r18) {
        /*
            r0 = r16
            r1 = r17
            java.util.List r2 = r1.f88835c
            int r2 = r2.size()
            java.util.List r3 = r18.mo38580e()
            int r3 = r3.size()
            if (r2 != r3) goto L_0x0201
            java.util.List r2 = r1.f88836d
            int r2 = r2.size()
            java.util.List r3 = r18.mo38578c()
            int r3 = r3.size()
            if (r2 != r3) goto L_0x0201
            java.util.List r2 = r1.f88837e
            int r2 = r2.size()
            java.util.List r3 = r18.mo38579d()
            int r3 = r3.size()
            if (r2 == r3) goto L_0x0036
            goto L_0x0201
        L_0x0036:
            java.util.List r2 = r18.mo38579d()
            java.util.List r3 = r18.mo38578c()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r3.iterator()
        L_0x0047:
            boolean r6 = r5.hasNext()
            r7 = 25
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            r8 = r6
            com.google.assistant.e.j.e.ew r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r8
            com.google.protobuf.cq r8 = r8.f136288b
            java.lang.String r9 = "group.formFieldList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0067
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0047
        L_0x0067:
            java.util.Iterator r8 = r8.iterator()
        L_0x006b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0047
            java.lang.Object r9 = r8.next()
            com.google.assistant.e.j.e.eu r9 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r9
            int r9 = r9.f136277e
            if (r9 != r7) goto L_0x006b
            r4.add(r6)
            goto L_0x0047
        L_0x007f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0088:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00a6
            java.lang.Object r6 = r4.next()
            com.google.assistant.e.j.e.ew r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r6
            int r6 = r3.indexOf(r6)
            java.util.List r8 = r1.f88836d
            java.lang.Object r6 = p5462h.p5463a.C69540x.m100822D(r8, r6)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView r6 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView) r6
            if (r6 == 0) goto L_0x0088
            r5.add(r6)
            goto L_0x0088
        L_0x00a6:
            java.util.List r3 = r1.f88837e
            java.util.List r3 = p5462h.p5463a.C69540x.m100840V(r3)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r6 = 0
        L_0x00b2:
            boolean r8 = r3.hasNext()
            r9 = -2
            r10 = 0
            r11 = -1
            r12 = 1
            if (r8 == 0) goto L_0x0154
            java.lang.Object r8 = r3.next()
            int r13 = r6 + 1
            if (r6 >= 0) goto L_0x00c7
            p5462h.p5463a.C69540x.m100952j()
        L_0x00c7:
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r14 = r2.get(r6)
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            java.util.Map r15 = r1.f88839g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r15.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x00ea
            int r6 = r6.intValue()
            java.util.List r10 = r1.f88836d
            java.lang.Object r6 = p5462h.p5463a.C69540x.m100822D(r10, r6)
            r10 = r6
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView r10 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView) r10
        L_0x00ea:
            if (r10 != 0) goto L_0x00ed
            goto L_0x0151
        L_0x00ed:
            int r6 = r14.f136277e
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r7) goto L_0x0136
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            java.lang.Object r9 = r14.f136278f
            com.google.assistant.e.c.c.hn r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51131hn) r9
            java.lang.String r14 = "formField.spacer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            int r9 = r9.f133090a
            int r9 = com.google.assistant.p3897e.p3902c.p3907c.C51130hm.m86034a(r9)
            if (r9 != 0) goto L_0x0107
            r9 = 1
        L_0x0107:
            int r9 = r9 + r11
            if (r9 == r12) goto L_0x0129
            r12 = 2
            if (r9 == r12) goto L_0x0122
            r12 = 3
            if (r9 == r12) goto L_0x011b
            r12 = 4
            if (r9 == r12) goto L_0x0114
            goto L_0x012f
        L_0x0114:
            r9 = 28
            int r11 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61643a(r0, r9)
            goto L_0x012f
        L_0x011b:
            r9 = 20
            int r11 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61643a(r0, r9)
            goto L_0x012f
        L_0x0122:
            r9 = 16
            int r11 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61643a(r0, r9)
            goto L_0x012f
        L_0x0129:
            r9 = 8
            int r11 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l.m61643a(r0, r9)
        L_0x012f:
            r6.<init>(r4, r11, r15)
            r10.addView(r8, r6)
            goto L_0x0151
        L_0x0136:
            r12 = 17
            if (r6 != r12) goto L_0x013b
            goto L_0x014e
        L_0x013b:
            r12 = 10
            if (r6 == r12) goto L_0x014e
            boolean r6 = r5.contains(r10)
            if (r6 != 0) goto L_0x014e
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r11, r9, r15)
            r10.addView(r8, r6)
            goto L_0x0151
        L_0x014e:
            r10.addView(r8)
        L_0x0151:
            r6 = r13
            goto L_0x00b2
        L_0x0154:
            java.util.List r2 = r1.f88836d
            java.util.List r2 = p5462h.p5463a.C69540x.m100840V(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x015f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0195
            java.lang.Object r5 = r2.next()
            int r6 = r3 + 1
            if (r3 >= 0) goto L_0x0170
            p5462h.p5463a.C69540x.m100952j()
        L_0x0170:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormFieldGroupView r5 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView) r5
            java.util.Map r7 = r1.f88838f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r7.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x018d
            int r3 = r3.intValue()
            java.util.List r7 = r1.f88835c
            java.lang.Object r3 = p5462h.p5463a.C69540x.m100822D(r7, r3)
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormSubSectionView r3 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormSubSectionView) r3
            goto L_0x018e
        L_0x018d:
            r3 = r10
        L_0x018e:
            if (r3 == 0) goto L_0x0193
            r3.addView(r5)
        L_0x0193:
            r3 = r6
            goto L_0x015f
        L_0x0195:
            java.util.List r2 = r18.mo38580e()
            java.util.List r3 = r1.f88835c
            java.util.List r3 = p5462h.p5463a.C69540x.m100840V(r3)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x01a4:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01f9
            java.lang.Object r6 = r3.next()
            int r7 = r5 + 1
            if (r5 >= 0) goto L_0x01b5
            p5462h.p5463a.C69540x.m100952j()
        L_0x01b5:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormSubSectionView r6 = (com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormSubSectionView) r6
            java.lang.Object r5 = r2.get(r5)
            com.google.assistant.e.j.e.fa r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r5
            if (r10 == 0) goto L_0x01ca
            int r8 = r5.f136302g
            int r8 = com.google.assistant.p3897e.p3921j.p3926e.C51946ez.m86445a(r8)
            if (r8 != 0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            if (r8 != r12) goto L_0x01e0
        L_0x01ca:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView r8 = r1.f88833a
            m61580d(r10, r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r0)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r11, r9)
            r8.setLayoutParams(r10)
            r8.setOrientation(r4)
            r10 = r8
        L_0x01e0:
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            if (r8 != 0) goto L_0x01eb
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r11, r9)
        L_0x01eb:
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            float r5 = r5.f136303h
            r8.weight = r5
            r6.setLayoutParams(r8)
            r10.addView(r6)
            r5 = r7
            goto L_0x01a4
        L_0x01f9:
            com.google.android.libraries.search.assistant.fluidactions.rendering.ui.FormMainView r0 = r1.f88833a
            m61580d(r10, r0)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.SUCCESSFUL
            return r0
        L_0x0201:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33205s.f88805a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50963(0xc713, float:7.1414E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Failed to build form view due to view structure mismatch. Aborted!!"
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.fluidactions.rendering.d.j r0 = com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j.ABORTED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c.C33204r.m61579c(android.content.Context, com.google.android.libraries.search.assistant.fluidactions.rendering.d.g, com.google.android.libraries.search.assistant.fluidactions.rendering.a.g):com.google.android.libraries.search.assistant.fluidactions.rendering.d.j");
    }

    /* renamed from: d */
    private static final void m61580d(LinearLayout linearLayout, FormMainView formMainView) {
        if (linearLayout != null) {
            if (linearLayout.getChildCount() == 1) {
                View childAt = linearLayout.getChildAt(0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                C69664n.m101059e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 0.0f;
                childAt.setLayoutParams(layoutParams2);
            } else if (linearLayout.getChildCount() > 1) {
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt2 = linearLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    C69664n.m101059e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.width = 0;
                    childAt2.setLayoutParams(layoutParams4);
                }
            }
            formMainView.addView(linearLayout);
        }
    }
}
