package com.google.android.gms.learning.p10825e.p10826a;

import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.dynamite.training.C144680aw;
import com.google.android.libraries.micore.learning.training.C29725a;
import com.google.android.libraries.micore.learning.training.C29726b;
import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.p3728as.p3729a.p3730a.C48030j;
import com.google.p4017at.p4044d.p4045a.C53919b;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.google.android.gms.learning.e.a.a */
/* compiled from: PG */
public final class C144738a implements C29727c {

    /* renamed from: a */
    private static final C58528ij f391535a = new C58759qy("app");

    /* renamed from: b */
    private final C144827n f391536b;

    /* renamed from: c */
    private final String f391537c;

    /* renamed from: d */
    private final C144680aw f391538d;

    public C144738a(C144827n nVar, String str, C144680aw awVar) {
        this.f391536b = nVar;
        this.f391537c = str;
        this.f391538d = awVar;
    }

    /* renamed from: a */
    public final C29725a mo34875a(C53919b bVar, C48030j jVar, C59628h hVar) {
        String str = bVar.f141479b;
        C63070h hVar2 = bVar.f141478a;
        if (hVar2 == null) {
            hVar2 = C63070h.f170215c;
        }
        C63070h hVar3 = hVar2;
        C63070h hVar4 = bVar.f141480c;
        if (hVar4 == null) {
            hVar4 = C63070h.f170215c;
        }
        C63088z byteString = hVar4.toByteString();
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || !((C58759qy) f391535a).f156534a.equals(scheme) || uri.getFragment() != null || uri.getQuery() != null) {
                this.f391536b.mo120058j(72, this.f391537c);
                throw new C29726b(String.format("URI invalid: appId=%s, collectionUri=%s", new Object[]{this.f391537c, str}));
            }
            String authority = uri.getAuthority();
            if (!"app".equals(scheme) || C58837ba.m90859h(authority) || this.f391537c.equals(authority)) {
                String rawPath = uri.getRawPath();
                if ("app".equals(scheme)) {
                    this.f391536b.mo120058j(76, this.f391537c);
                    if (!"com.google.android.gms".equals(this.f391537c)) {
                        return this.f391538d.mo120150a(rawPath, hVar3, byteString, hVar, (String) null, jVar);
                    }
                    String d = C144750m.m235266d(rawPath);
                    if (d != null) {
                        this.f391536b.mo120056h(1599);
                        return this.f391538d.mo120150a(rawPath, hVar3, byteString, hVar, d, jVar);
                    }
                    this.f391536b.mo120056h(1600);
                    throw new C29726b("invalid collection for GMS Core hosted example store, must match /<module name>/<collection name>: ".concat(String.valueOf(rawPath)));
                }
                throw new RuntimeException("Unexpected scheme: ".concat(scheme));
            }
            this.f391536b.mo120058j(78, this.f391537c);
            throw new C29726b(String.format("collection_uri authority segment mismatches training task's app: %s vs %s", new Object[]{authority, this.f391537c}));
        } catch (URISyntaxException e) {
            this.f391536b.mo120058j(72, this.f391537c);
            throw new C29726b(String.format("URI invalid: appId=%s, collectionUri=%s", new Object[]{this.f391537c, str}), e);
        }
    }
}
