package com.google.android.libraries.p1635au;

import com.evernote.android.state.BuildConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.au.m */
/* compiled from: PG */
public final class C19576m implements C69464a {

    /* renamed from: d */
    private static final Charset f54492d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final List f54493e = new ArrayList();

    /* renamed from: a */
    public final Map f54494a = new HashMap(10);

    /* renamed from: b */
    public final Object f54495b = new Object();

    /* renamed from: c */
    public volatile C19575l f54496c;

    /* renamed from: f */
    private final String f54497f;

    static {
        new C19576m(BuildConfig.FLAVOR);
    }

    private C19576m(String str) {
        this.f54497f = str;
    }

    /* renamed from: a */
    public static long m37334a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f54492d));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static synchronized C19576m m37335e(String str) {
        synchronized (C19576m.class) {
            for (C19576m mVar : f54493e) {
                if (mVar.f54497f.equals(str)) {
                    return mVar;
                }
            }
            C19576m mVar2 = new C19576m(str);
            f54493e.add(mVar2);
            return mVar2;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        return this.f54496c;
    }

    /* renamed from: c */
    public final C19567d mo24833c(String str, C19571h... hVarArr) {
        synchronized (this.f54495b) {
            C19567d dVar = (C19567d) this.f54494a.get(str);
            if (dVar != null) {
                dVar.mo24832e(hVarArr);
                return dVar;
            }
            C19567d dVar2 = new C19567d(str, this, hVarArr);
            this.f54494a.put(dVar2.f54486b, dVar2);
            return dVar2;
        }
    }

    /* renamed from: d */
    public final C19569f mo24834d(String str, C19571h... hVarArr) {
        synchronized (this.f54495b) {
            C19569f fVar = (C19569f) this.f54494a.get(str);
            if (fVar != null) {
                fVar.mo24832e(hVarArr);
                return fVar;
            }
            C19569f fVar2 = new C19569f(str, this, hVarArr);
            this.f54494a.put(fVar2.f54486b, fVar2);
            return fVar2;
        }
    }
}
