package com.google.android.apps.gsa.staticplugins.p7404aq.p7405a;

import android.content.ContentResolver;
import android.provider.ContactsContract;
import com.google.android.apps.gsa.contacts.u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C91089t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.aq.a.i */
/* compiled from: PG */
public final class C94051i {

    /* renamed from: a */
    public static final C59071e f262706a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aq.a.i");

    /* renamed from: d */
    private static final String[] f262707d = {"display_name", "times_contacted", "last_time_contacted", "starred"};

    /* renamed from: b */
    protected final u f262708b;

    /* renamed from: c */
    final boolean f262709c;

    /* renamed from: e */
    private final C86130z f262710e;

    /* renamed from: f */
    private final C86124t f262711f;

    public C94051i(ContentResolver contentResolver, C86130z zVar, boolean z, C86124t tVar) {
        this.f262708b = new u(contentResolver);
        this.f262710e = zVar;
        this.f262709c = z;
        this.f262711f = tVar;
    }

    /* renamed from: a */
    public final List mo88316a() {
        int i;
        C94050h hVar = new C94050h();
        if (this.f262709c) {
            i = (int) this.f262711f.mo79743a(C90086ek.f250354bZ);
        } else {
            i = this.f262710e.mo79762a(R.integer.abnf_compiler_num_contacts);
        }
        C91089t.m148814c(hVar, this.f262708b.a(ContactsContract.Contacts.CONTENT_URI, i, f262707d, (String) null, new String[0], "starred DESC, times_contacted DESC, last_time_contacted DESC"));
        hVar.f262704a.size();
        return hVar.f262704a;
    }
}
