package com.google.android.libraries.lens.view.p2162s;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.protos.p5124m.p5125a.C65603f;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.s.a */
/* compiled from: PG */
public final class C27683a {

    /* renamed from: a */
    private final Context f75601a;

    /* renamed from: b */
    private final C68214a f75602b;

    /* renamed from: c */
    private final C68214a f75603c;

    /* renamed from: d */
    private final C68214a f75604d;

    /* renamed from: e */
    private final C68214a f75605e;

    /* renamed from: f */
    private final C68214a f75606f;

    public C27683a(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f75601a = context;
        this.f75602b = aVar;
        this.f75603c = aVar2;
        this.f75604d = aVar3;
        this.f75605e = aVar4;
        this.f75606f = aVar5;
    }

    /* renamed from: d */
    private static boolean m51524d(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.equals(str)) {
                return true;
            }
            if (str2.endsWith("*") && str.startsWith(str2.substring(0, str2.length() - 1))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo33174a() {
        boolean hasSystemFeature = this.f75601a.getPackageManager().hasSystemFeature("org.chromium.arc");
        ((C19567d) ((C27691i) this.f75603c.mo27525b()).f75615c.mo6453a()).mo24822a(1, Boolean.valueOf(hasSystemFeature));
        return !hasSystemFeature;
    }

    /* renamed from: b */
    public final boolean mo33175b() {
        boolean z;
        try {
            this.f75601a.getPackageManager().getPackageInfo("com.google.ar.lens", 0);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        ((C19567d) ((C27691i) this.f75603c.mo27525b()).f75614b.mo6453a()).mo24822a(1, Boolean.valueOf(z));
        return z || mo33174a();
    }

    /* renamed from: c */
    public final int mo33176c(String str) {
        int i;
        if (!mo33175b()) {
            i = 5;
        } else if (!((Boolean) this.f75604d.mo27525b()).booleanValue() && (TextUtils.isEmpty(str) || m51524d(((C65603f) this.f75606f.mo27525b()).f178307a, str) || (!m51524d(((C65603f) this.f75605e.mo27525b()).f178307a, str) && !((C27692j) this.f75602b.mo27525b()).mo33178a(str)))) {
            i = 3;
        } else {
            i = 2;
        }
        if (str == null) {
            ((C27691i) this.f75603c.mo27525b()).mo33177a(BuildConfig.FLAVOR, C24072c.m44702a(i));
        } else {
            ((C27691i) this.f75603c.mo27525b()).mo33177a(str, C24072c.m44702a(i));
        }
        return i;
    }
}
