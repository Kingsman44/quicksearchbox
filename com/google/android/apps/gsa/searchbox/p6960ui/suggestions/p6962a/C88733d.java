package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import com.google.android.apps.gsa.searchbox.p6960ui.C88704e;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88693b;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionViewWithActions;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.d */
/* compiled from: PG */
public final class C88733d extends C88704e {

    /* renamed from: a */
    private final Suggestion f240025a;

    /* renamed from: b */
    private final SuggestionViewWithActions f240026b;

    /* renamed from: c */
    private final C88734e f240027c;

    /* renamed from: d */
    private final C88693b f240028d;

    public C88733d(Suggestion suggestion, SuggestionViewWithActions suggestionViewWithActions, C88734e eVar, C88693b bVar) {
        this.f240025a = suggestion;
        this.f240026b = suggestionViewWithActions;
        this.f240027c = eVar;
        this.f240028d = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01eb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82426a(com.google.android.apps.gsa.search.shared.service.p6935b.C87845fs r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionViewWithActions r2 = r0.f240026b
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r2 = r2.f240417n
            java.lang.CharSequence r2 = r2.f108908i
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r3 = r0.f240025a
            java.lang.CharSequence r3 = r3.f108908i
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0020
            com.google.android.apps.gsa.searchbox.ui.a.b r1 = r0.f240028d
            com.google.android.apps.gsa.shared.an.a.j r1 = r1.f239809a
            if (r1 == 0) goto L_0x001f
            java.lang.String r2 = "ACTION_RESULT_NOT_RENDERED_COUNT"
            r1.mo83169i(r2)
        L_0x001f:
            return
        L_0x0020:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87748cc.f237499a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r3 = r1.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            if (r2 == 0) goto L_0x0218
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87748cc.f237499a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r1.mo58887l(r2)
            com.google.protobuf.bf r1 = r1.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r1 = r1.mo58854l(r3)
            if (r1 != 0) goto L_0x0049
            java.lang.Object r1 = r2.f169969b
            goto L_0x004d
        L_0x0049:
            java.lang.Object r1 = r2.mo58889c(r1)
        L_0x004d:
            com.google.android.apps.gsa.search.shared.service.b.cf r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87751cf) r1
            int r2 = r1.f237504b
            int r2 = com.google.common.p4552o.aor.m92446a(r2)
            r3 = 1
            if (r2 != 0) goto L_0x0059
            r2 = 1
        L_0x0059:
            com.google.android.apps.gsa.searchbox.ui.suggestions.a.e r4 = r0.f240027c
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r5 = r0.f240025a
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionViewWithActions r6 = r0.f240026b
            com.google.cm.a.b.a.f r1 = r1.f237503a
            if (r1 != 0) goto L_0x0065
            com.google.cm.a.b.a.f r1 = com.google.p4500cm.p4501a.p4506b.p4507a.C58148f.f155452f
        L_0x0065:
            r7 = 8
            java.lang.String r8 = ""
            r9 = 0
            if (r1 != 0) goto L_0x0082
            com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88734e.m143780q(r6, r9)
            r6.mo82575x(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r8)
            r4.mo82476r(r5, r1, r3, r2)
            return
        L_0x0082:
            com.google.android.apps.gsa.plugins.a.b.b r1 = com.google.android.apps.gsa.plugins.p6468a.p6470b.C84057b.m133953c(r1)
            androidx.c.n r10 = r1.f228947a
            java.lang.String r11 = "ContactMethods"
            java.util.List r1 = r1.mo77513e(r10, r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r1 = r1.iterator()
            r12 = 0
        L_0x009d:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L_0x01ff
            java.lang.Object r13 = r1.next()
            com.google.android.apps.gsa.plugins.a.b.b r13 = (com.google.android.apps.gsa.plugins.p6468a.p6470b.C84057b) r13
            java.lang.String[] r14 = new java.lang.String[r3]
            java.lang.String r15 = "image"
            r14[r9] = r15
            java.lang.String r14 = r13.mo77512d(r14)
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.String r16 = "MethodType"
            r15[r9] = r16
            r16 = r8
            long r7 = r13.mo77510a(r15)
            int r8 = (int) r7
            switch(r8) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00d0;
                case 3: goto L_0x00ce;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00c5;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            r8 = 0
            goto L_0x00d5
        L_0x00c5:
            r8 = 8
            goto L_0x00d5
        L_0x00c8:
            r8 = 7
            goto L_0x00d5
        L_0x00ca:
            r8 = 6
            goto L_0x00d5
        L_0x00cc:
            r8 = 5
            goto L_0x00d5
        L_0x00ce:
            r8 = 4
            goto L_0x00d5
        L_0x00d0:
            r8 = 3
            goto L_0x00d5
        L_0x00d2:
            r8 = 2
            goto L_0x00d5
        L_0x00d4:
            r8 = 1
        L_0x00d5:
            java.lang.String r7 = r13.f228948b
            boolean r17 = android.text.TextUtils.isEmpty(r14)
            if (r17 != 0) goto L_0x01f5
            if (r8 == r3) goto L_0x01f5
            boolean r17 = android.text.TextUtils.isEmpty(r7)
            if (r17 != 0) goto L_0x01f5
            if (r8 == 0) goto L_0x01f5
            int r17 = r12 + 1
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionActionView r12 = r6.mo82573p(r12, r7)
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionIconView r15 = r12.f240373c
            com.google.android.apps.gsa.searchbox.ui.f r9 = r4.f240008n
            r0 = 0
            r15.mo82564g(r14, r0, r9)
            java.lang.String[] r9 = new java.lang.String[r3]
            java.lang.String r14 = "Label"
            r15 = 0
            r9[r15] = r14
            java.lang.String r9 = r13.mo77512d(r9)
            int r8 = r8 + -1
            if (r8 == r3) goto L_0x0127
            r14 = 2
            if (r8 == r14) goto L_0x0123
            r14 = 3
            if (r8 == r14) goto L_0x011f
            r14 = 4
            if (r8 == r14) goto L_0x011b
            r14 = 6
            if (r8 == r14) goto L_0x0117
            r14 = 7
            if (r8 == r14) goto L_0x011b
            r14 = 2132085910(0x7f150c96, float:1.9812032E38)
            goto L_0x012a
        L_0x0117:
            r14 = 2132085913(0x7f150c99, float:1.9812038E38)
            goto L_0x012a
        L_0x011b:
            r14 = 2132085907(0x7f150c93, float:1.9812026E38)
            goto L_0x012a
        L_0x011f:
            r14 = 2132085909(0x7f150c95, float:1.981203E38)
            goto L_0x012a
        L_0x0123:
            r14 = 2132085912(0x7f150c98, float:1.9812036E38)
            goto L_0x012a
        L_0x0127:
            r14 = 2132085908(0x7f150c94, float:1.9812028E38)
        L_0x012a:
            boolean r15 = android.text.TextUtils.isEmpty(r9)
            if (r3 == r15) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r9 = r0
        L_0x0132:
            r12.mo82555a(r14, r9)
            java.lang.String r9 = "name"
            if (r8 == r3) goto L_0x01b6
            java.lang.String r14 = "PhoneNumber"
            r15 = 2
            if (r8 == r15) goto L_0x01a4
            r15 = 3
            if (r8 == r15) goto L_0x0190
            r15 = 4
            if (r8 == r15) goto L_0x017e
            r15 = 6
            if (r8 == r15) goto L_0x016c
            r15 = 7
            if (r8 == r15) goto L_0x015b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r15 = 0
            r8[r15] = r9
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x015b:
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r15] = r14
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x016c:
            r8 = 6
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r15] = r9
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x017e:
            r8 = 4
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r15] = r9
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x0190:
            r8 = 3
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.String r9 = "EmailAddress"
            r8[r15] = r9
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x01a4:
            r8 = 2
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r15] = r14
            java.lang.String r8 = r13.mo77512d(r8)
            goto L_0x01c7
        L_0x01b6:
            r8 = 5
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.add(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            r8[r15] = r9
            java.lang.String r8 = r13.mo77512d(r8)
        L_0x01c7:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x01d0
        L_0x01cd:
            r7 = r16
            goto L_0x01e0
        L_0x01d0:
            java.util.regex.Pattern r9 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88734e.f240029a
            java.util.regex.Matcher r7 = r9.matcher(r7)
            boolean r9 = r7.find()
            if (r9 == 0) goto L_0x01cd
            java.lang.String r7 = r7.group(r3)
        L_0x01e0:
            r11.add(r7)
            boolean r7 = r4.f240030b
            if (r7 == 0) goto L_0x01eb
            r12.mo82556b(r8)
            goto L_0x01ee
        L_0x01eb:
            r12.mo82556b(r0)
        L_0x01ee:
            r0 = r18
            r8 = r16
            r12 = r17
            goto L_0x01fa
        L_0x01f5:
            r15 = 0
            r0 = r18
            r8 = r16
        L_0x01fa:
            r7 = 8
            r9 = 0
            goto L_0x009d
        L_0x01ff:
            r16 = r8
            com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88734e.m143780q(r6, r12)
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.add(r0)
            r0 = r16
            r11.add(r0)
            r4.mo82476r(r5, r10, r11, r2)
            r6.mo82575x(r3)
        L_0x0218:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88733d.mo82426a(com.google.android.apps.gsa.search.shared.service.b.fs):void");
    }
}
