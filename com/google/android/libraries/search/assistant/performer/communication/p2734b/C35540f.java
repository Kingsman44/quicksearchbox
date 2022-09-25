package com.google.android.libraries.search.assistant.performer.communication.p2734b;

import android.database.Cursor;
import android.databinding.C0118a;
import android.provider.CallLog;
import com.google.android.libraries.search.assistant.performer.communication.C35516ai;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52297mn;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.b.f */
/* compiled from: PG */
public final class C35540f implements C35516ai {

    /* renamed from: a */
    static final String[] f93329a = {"_id", "display_name"};

    /* renamed from: b */
    static final String[] f93330b = {"type", "number", "name"};

    /* renamed from: c */
    public static final /* synthetic */ int f93331c = 0;

    /* renamed from: d */
    private static final C59071e f93332d = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.b.f");

    /* renamed from: e */
    private final C46877q f93333e;

    /* renamed from: f */
    private final C60887da f93334f;

    public C35540f(C46877q qVar, C60887da daVar) {
        this.f93333e = qVar;
        this.f93334f = daVar;
    }

    /* renamed from: d */
    public static String m63891d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            return cursor.getString(columnIndex);
        }
        C0118a.m96d(f93332d.mo56226d(), "Failed to read column from cursor due to invalid index", 51741, C58979ad.SMALL);
        return null;
    }

    /* renamed from: e */
    private final C60870cx m63892e(C52297mn mnVar, List list) {
        C58528ij ijVar;
        if (list == null) {
            ijVar = null;
        } else {
            ijVar = (C58528ij) Collection.EL.stream(list).filter(C35535a.f93316a).map(C35536b.f93317a).collect(C58370cn.f155947b);
        }
        return this.f93333e.mo50872b(CallLog.Calls.CONTENT_URI, f93330b, (String) null, (String[]) null, "date DESC").f121591a.mo57273f(C47810es.m84968h(new C35537c(this, ijVar, mnVar)), this.f93334f).mo57275g();
    }

    /* renamed from: a */
    public final C60870cx mo39689a(C52297mn mnVar) {
        return m63892e(mnVar, (List) null);
    }

    /* renamed from: b */
    public final C60870cx mo39690b(C52297mn mnVar, List list) {
        if (list.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        return m63892e(mnVar, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo39694c(android.database.Cursor r16, int r17, com.google.common.p4522b.C58528ij r18, java.util.Set r19, com.google.assistant.p3897e.p3921j.C52297mn r20) {
        /*
            r15 = this;
            r8 = r15
            r4 = r16
            r5 = r17
            boolean r0 = r16.moveToNext()
            if (r0 == 0) goto L_0x010a
            int r0 = r19.size()
            r1 = 30
            if (r0 >= r1) goto L_0x010a
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 < r0) goto L_0x0019
            goto L_0x010a
        L_0x0019:
            java.lang.String r0 = "type"
            int r0 = r4.getColumnIndex(r0)
            r1 = -1
            if (r0 == r1) goto L_0x0032
            boolean r1 = r4.isNull(r0)
            if (r1 == 0) goto L_0x0029
            goto L_0x0032
        L_0x0029:
            int r0 = r4.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0043
        L_0x0032:
            com.google.common.f.e r0 = f93332d
            com.google.common.f.x r0 = r0.mo56226d()
            r1 = 51740(0xca1c, float:7.2503E-41)
            com.google.common.f.ad r2 = com.google.common.p4526f.C58979ad.SMALL
            java.lang.String r3 = "Failed to read column from cursor due to invalid index"
            android.databinding.C0118a.m96d(r0, r3, r1, r2)
            r0 = 0
        L_0x0043:
            java.lang.String r1 = "number"
            java.lang.String r3 = m63891d(r4, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r2 = 1
            if (r1 == 0) goto L_0x005f
            int r2 = r2 + r5
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            com.google.common.util.concurrent.cx r0 = r0.mo39694c(r1, r2, r3, r4, r5)
            return r0
        L_0x005f:
            r6 = r19
            r6.add(r3)
            if (r0 == 0) goto L_0x00fb
            int r0 = r0.intValue()
            com.google.assistant.e.j.mn r1 = com.google.assistant.p3897e.p3921j.C52297mn.UNKNOWN_TYPE
            int r1 = r20.ordinal()
            r7 = 3
            r9 = 2
            r10 = 0
            if (r1 == r2) goto L_0x0087
            if (r1 == r9) goto L_0x0084
            if (r1 == r7) goto L_0x0081
            r11 = 4
            if (r1 == r11) goto L_0x007e
            r1 = 0
            goto L_0x0088
        L_0x007e:
            r1 = 0
            r10 = 1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            r11 = 1
            goto L_0x0089
        L_0x0084:
            r1 = 0
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r1 = 1
        L_0x0088:
            r11 = 0
        L_0x0089:
            if (r10 == 0) goto L_0x008d
            if (r0 == r2) goto L_0x0098
        L_0x008d:
            if (r1 == 0) goto L_0x0091
            if (r0 == r9) goto L_0x0098
        L_0x0091:
            if (r11 == 0) goto L_0x00fb
            if (r0 == r7) goto L_0x0098
            r1 = 5
            if (r0 != r1) goto L_0x00fb
        L_0x0098:
            java.lang.String r0 = "name"
            java.lang.String r0 = m63891d(r4, r0)
            if (r18 != 0) goto L_0x00b8
            com.google.android.libraries.search.assistant.performer.communication.ag r1 = com.google.android.libraries.search.assistant.performer.communication.C35515ah.m63872d()
            r2 = r1
            com.google.android.libraries.search.assistant.performer.communication.d r2 = (com.google.android.libraries.search.assistant.performer.communication.C35598d) r2
            r2.f93433b = r0
            r2.f93434c = r3
            com.google.android.libraries.search.assistant.performer.communication.ah r0 = r1.mo39685a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00b8:
            android.net.Uri r0 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
            java.lang.String r1 = android.net.Uri.encode(r3)
            android.net.Uri r10 = android.net.Uri.withAppendedPath(r0, r1)
            com.google.apps.tiktok.dataservice.q r9 = r8.f93333e
            java.lang.String[] r11 = f93329a
            r12 = 0
            r13 = 0
            r14 = 0
            com.google.apps.tiktok.concurrent.o r0 = r9.mo50872b(r10, r11, r12, r13, r14)
            com.google.common.util.concurrent.ay r0 = r0.f121591a
            com.google.android.libraries.search.assistant.performer.communication.b.e r1 = com.google.android.libraries.search.assistant.performer.communication.p2734b.C35539e.f93328a
            com.google.common.util.concurrent.al r1 = com.google.apps.tiktok.tracing.C47810es.m84970j(r1)
            com.google.common.util.concurrent.da r2 = r8.f93334f
            com.google.common.util.concurrent.ay r0 = r0.mo57272e(r1, r2)
            com.google.common.util.concurrent.bs r9 = r0.mo57275g()
            com.google.android.libraries.search.assistant.performer.communication.b.d r10 = new com.google.android.libraries.search.assistant.performer.communication.b.d
            r0 = r10
            r1 = r15
            r2 = r18
            r4 = r16
            r5 = r17
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.da r0 = r8.f93334f
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r10)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r9, r1, r0)
            return r0
        L_0x00fb:
            int r2 = r2 + r5
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            com.google.common.util.concurrent.cx r0 = r0.mo39694c(r1, r2, r3, r4, r5)
            return r0
        L_0x010a:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.p2734b.C35540f.mo39694c(android.database.Cursor, int, com.google.common.b.ij, java.util.Set, com.google.assistant.e.j.mn):com.google.common.util.concurrent.cx");
    }
}
