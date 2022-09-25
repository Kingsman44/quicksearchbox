package com.google.android.libraries.social.p3260a.p3263b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1623at.p1632e.C19555c;
import com.google.android.libraries.social.p3260a.C41901a;
import com.google.android.libraries.social.p3260a.p3265d.C41909b;
import com.google.android.libraries.social.p3260a.p3265d.C41912e;
import com.google.common.p4552o.p4566l.C60200dk;
import java.util.Locale;

/* renamed from: com.google.android.libraries.social.a.b.a */
/* compiled from: PG */
public final class C41903a implements C41901a {

    /* renamed from: a */
    public final int f109305a;

    /* renamed from: b */
    public final C41909b f109306b;

    /* renamed from: c */
    public String f109307c;

    /* renamed from: d */
    private C60200dk f109308d;

    /* renamed from: e */
    private Integer f109309e;

    public C41903a(int i, C41909b bVar) {
        this.f109305a = i;
        this.f109306b = bVar;
    }

    /* renamed from: a */
    public final void mo44359a() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C41903a) {
            C41903a aVar = (C41903a) obj;
            if (this.f109305a == aVar.f109305a) {
                C60200dk dkVar = aVar.f109308d;
                if (C19555c.m37297b((Object) null, (Object) null)) {
                    Integer num = aVar.f109309e;
                    if (!C19555c.m37297b((Object) null, (Object) null) || !this.f109306b.equals(aVar.f109306b) || !C19555c.m37297b(this.f109307c, aVar.f109307c)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (C19555c.m37296a(this.f109307c, C19555c.m37296a((Object) null, C19555c.m37296a((Object) null, this.f109306b.hashCode()))) * 31) + this.f109305a;
    }

    public final String toString() {
        return String.format(Locale.US, "UserEvent action: %d%s%s on: %s ", new Object[]{Integer.valueOf(this.f109305a), BuildConfig.FLAVOR, BuildConfig.FLAVOR, C41912e.m73437a(this.f109306b.f109314a)});
    }
}
