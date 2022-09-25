package com.google.android.apps.search.googleapp.incognito.p10327f;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;
import java.net.HttpCookie;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.incognito.f.f */
/* compiled from: PG */
public final /* synthetic */ class C136279f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136281h f371099a;

    public /* synthetic */ C136279f(C136281h hVar) {
        this.f371099a = hVar;
    }

    public final C60870cx apply(Object obj) {
        Optional empty;
        C136281h hVar = this.f371099a;
        Iterator it = ((C61366ah) obj).f165945a.mo55277g(C61362ad.m93870b("Set-Cookie")).iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                empty = Optional.empty();
                break;
            }
            Iterator<HttpCookie> it2 = HttpCookie.parse((String) it.next()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    HttpCookie next = it2.next();
                    if (next.getName().equals("NID") && !next.getValue().isEmpty()) {
                        empty = Optional.m71637of(next.getValue());
                        break loop0;
                    }
                }
            }
        }
        if (empty.isPresent()) {
            C46459k.m82829b(hVar.f371103c.mo46039a(new C136280g(empty), C60826bg.f164896a), "Failed to save Zwieback token", new Object[0]);
        }
        return C60856cj.m92900i(empty);
    }
}
