package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9327d.C123693c;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124048ad;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124053ah;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53133cp;
import com.google.assistant.p3994s.p3995a.C53134cq;
import com.google.assistant.p3994s.p3995a.C53135cr;
import com.google.assistant.p3994s.p3995a.C53136cs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58913w;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.m */
/* compiled from: PG */
public final class C124017m {

    /* renamed from: a */
    public static final C59071e f342544a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.g.m");

    /* renamed from: b */
    public final Executor f342545b;

    /* renamed from: c */
    public final C123693c f342546c;

    /* renamed from: d */
    public final C123623b f342547d;

    /* renamed from: e */
    public final C124048ad f342548e;

    /* renamed from: f */
    public final C124053ah f342549f;

    /* renamed from: g */
    public final boolean f342550g;

    public C124017m(Executor executor, AccountId accountId, Context context, C123693c cVar, C124048ad adVar, C124053ah ahVar, boolean z) {
        this.f342545b = executor;
        this.f342546c = cVar;
        this.f342548e = adVar;
        this.f342549f = ahVar;
        this.f342550g = z;
        this.f342547d = C123624c.m202992a(context, accountId);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58485gu mo106232a(C42847bf bfVar, Optional optional) {
        C42840az azVar = new C42840az();
        azVar.f112130a.append("SELECT SharedProactiveData.data_type AS DATA_TYPE, SharedProactiveData.data_id AS DATA_ID, hash_tag, token, client_type, data_content_hash FROM SharedProactiveData LEFT JOIN ClientProactiveData ON (SharedProactiveData.data_id = ClientProactiveData.data_id AND SharedProactiveData.data_type = ClientProactiveData.data_type)");
        if (optional.isPresent() && !((Set) optional.get()).isEmpty()) {
            ArrayList arrayList = new ArrayList((Collection) optional.get());
            azVar.f112130a.append(" WHERE SharedProactiveData.data_type IN(?");
            azVar.f112131b.add(Long.valueOf((long) ((Integer) arrayList.get(0)).intValue()));
            for (int i = 1; i < arrayList.size(); i++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add(Long.valueOf((long) ((Integer) arrayList.get(i)).intValue()));
            }
            azVar.f112130a.append(")");
        }
        azVar.f112130a.append(" UNION SELECT ClientProactiveData.data_type AS DATA_TYPE, ClientProactiveData.data_id AS DATA_ID, hash_tag, token, client_type, data_content_hash FROM ClientProactiveData LEFT JOIN SharedProactiveData ON (SharedProactiveData.data_id = ClientProactiveData.data_id AND SharedProactiveData.data_type = ClientProactiveData.data_type) WHERE SharedProactiveData.data_id IS NULL");
        if (optional.isPresent() && !((Set) optional.get()).isEmpty()) {
            ArrayList arrayList2 = new ArrayList((Collection) optional.get());
            azVar.f112130a.append(" AND ClientProactiveData.data_type IN(?");
            azVar.f112131b.add(Long.valueOf((long) ((Integer) arrayList2.get(0)).intValue()));
            for (int i2 = 1; i2 < arrayList2.size(); i2++) {
                azVar.f112130a.append(", ?");
                azVar.f112131b.add(Long.valueOf((long) ((Integer) arrayList2.get(i2)).intValue()));
            }
            azVar.f112130a.append(")");
        }
        Cursor d = bfVar.mo45932d(azVar.mo45920a());
        try {
            C58480gp e = C58485gu.m89837e();
            C53133cp cpVar = (C53133cp) C53136cs.f139269g.createBuilder();
            while (d.moveToNext()) {
                int i3 = d.getInt(d.getColumnIndexOrThrow("DATA_TYPE"));
                String string = d.getString(d.getColumnIndexOrThrow("DATA_ID"));
                byte[] blob = d.getBlob(d.getColumnIndexOrThrow("hash_tag"));
                byte[] blob2 = d.getBlob(d.getColumnIndexOrThrow("token"));
                C53306j a = C53306j.m86809a(d.getInt(d.getColumnIndexOrThrow("client_type")));
                byte[] blob3 = d.getBlob(d.getColumnIndexOrThrow("data_content_hash"));
                C53136cs csVar = (C53136cs) cpVar.instance;
                if ((csVar.f139271a & 2) == 0 || csVar.f139273c != i3 || !csVar.f139272b.equals(string)) {
                    if ((((C53136cs) cpVar.instance).f139271a & 1) != 0) {
                        e.mo55395g((C53136cs) cpVar.build());
                    }
                    cpVar = (C53133cp) C53136cs.f139269g.createBuilder();
                    cpVar.copyOnWrite();
                    C53136cs csVar2 = (C53136cs) cpVar.instance;
                    string.getClass();
                    csVar2.f139271a |= 1;
                    csVar2.f139272b = string;
                    cpVar.copyOnWrite();
                    C53136cs csVar3 = (C53136cs) cpVar.instance;
                    csVar3.f139271a |= 2;
                    csVar3.f139273c = i3;
                    if (blob != null && blob.length > 0) {
                        String str = new String(blob, C58913w.f156754c);
                        cpVar.copyOnWrite();
                        C53136cs csVar4 = (C53136cs) cpVar.instance;
                        csVar4.f139271a |= 4;
                        csVar4.f139274d = str;
                    }
                    if (blob2 != null && blob2.length > 0) {
                        C63088z A = C63088z.m96139A(blob2);
                        cpVar.copyOnWrite();
                        C53136cs csVar5 = (C53136cs) cpVar.instance;
                        csVar5.f139271a |= 8;
                        csVar5.f139276f = A;
                    }
                    if (blob3 != null && blob3.length > 0) {
                        C53134cq cqVar = (C53134cq) C53135cr.f139264d.createBuilder();
                        cqVar.copyOnWrite();
                        C53135cr crVar = (C53135cr) cqVar.instance;
                        crVar.f139267b = a.f139793X;
                        crVar.f139266a |= 1;
                        String str2 = new String(blob3, C58913w.f156754c);
                        cqVar.copyOnWrite();
                        C53135cr crVar2 = (C53135cr) cqVar.instance;
                        crVar2.f139266a |= 2;
                        crVar2.f139268c = str2;
                        cpVar.mo53963a(cqVar);
                    }
                } else if (blob3 != null && blob3.length > 0) {
                    C53134cq cqVar2 = (C53134cq) C53135cr.f139264d.createBuilder();
                    cqVar2.copyOnWrite();
                    C53135cr crVar3 = (C53135cr) cqVar2.instance;
                    crVar3.f139267b = a.f139793X;
                    crVar3.f139266a |= 1;
                    String str3 = new String(blob3, C58913w.f156754c);
                    cqVar2.copyOnWrite();
                    C53135cr crVar4 = (C53135cr) cqVar2.instance;
                    crVar4.f139266a |= 2;
                    crVar4.f139268c = str3;
                    cpVar.mo53963a(cqVar2);
                }
            }
            if ((((C53136cs) cpVar.instance).f139271a & 1) != 0) {
                e.mo55395g((C53136cs) cpVar.build());
            }
            C58485gu f = e.mo55394f();
            if (d != null) {
                d.close();
            }
            return f;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
