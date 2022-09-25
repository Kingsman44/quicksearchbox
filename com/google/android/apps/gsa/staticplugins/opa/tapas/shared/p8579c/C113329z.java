package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58733pz;
import java.util.regex.Pattern;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.z */
/* compiled from: PG */
public final /* synthetic */ class C113329z implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C113304aa f313853a;

    /* renamed from: b */
    public final /* synthetic */ String f313854b;

    public /* synthetic */ C113329z(C113304aa aaVar, String str) {
        this.f313853a = aaVar;
        this.f313854b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58471gg ggVar;
        C113304aa aaVar = this.f313853a;
        String str = this.f313854b;
        if (!aaVar.mo100108a()) {
            return C58485gu.m89845m();
        }
        if (!aaVar.mo100108a()) {
            ggVar = C58733pz.f156496a;
        } else if (TextUtils.isEmpty(str)) {
            ggVar = C58733pz.f156496a;
        } else {
            String str2 = "%" + str + "%";
            String[] strArr = {str2, str2, str2};
            C58526ih ihVar = new C58526ih();
            Cursor query = aaVar.f313793e.query(ContactsContract.Contacts.CONTENT_URI, C113304aa.f313790b, "display_name LIKE ? OR display_name_alt LIKE ? OR phonetic_name LIKE ?", strArr, "last_time_contacted DESC, sort_key ASC");
            if (query == null) {
                try {
                    ggVar = C58733pz.f156496a;
                } catch (Throwable th) {
                    C113325v.m187489a(th, th);
                }
            } else if (query.moveToFirst()) {
                for (int i = 0; i < query.getCount(); i++) {
                    query.moveToPosition(i);
                    long j = query.getLong(query.getColumnIndex("_id"));
                    if (Collection.EL.stream((C58485gu) DesugarArrays.stream((T[]) C113304aa.f313789a).map(new C113327x(query)).filter(C113328y.f313852a).collect(C58370cn.f155946a)).anyMatch(new C113326w("\\b" + Pattern.quote(C80884a.m128736a(str)) + "\\b"))) {
                        ihVar.mo55373c(Long.valueOf(j));
                    }
                }
                ggVar = ihVar.mo55486f();
                query.close();
            } else {
                query.close();
                ggVar = C58733pz.f156496a;
            }
        }
        C58485gu u = ggVar.mo55229u();
        if (u.isEmpty()) {
            return C58485gu.m89845m();
        }
        return u;
        throw th;
    }
}
