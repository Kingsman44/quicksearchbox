package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
/* compiled from: PG */
public abstract class C5927b implements C5930e {

    /* renamed from: a */
    private final String f17578a;

    /* renamed from: b */
    private final AssetManager f17579b;

    /* renamed from: c */
    private Object f17580c;

    public C5927b(AssetManager assetManager, String str) {
        this.f17579b = assetManager;
        this.f17578a = str;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        Object obj = this.f17580c;
        if (obj != null) {
            try {
                mo12381g(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        try {
            Object f = mo12380f(this.f17579b, this.f17578a);
            this.f17580c = f;
            dVar.mo12183f(f);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            dVar.mo12184g(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo12380f(AssetManager assetManager, String str);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo12381g(Object obj);
}
