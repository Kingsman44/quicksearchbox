package com.google.android.gms.vision.internal.client;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.C146305f;

/* renamed from: com.google.android.gms.vision.internal.client.a */
/* compiled from: PG */
public abstract class C146318a {

    /* renamed from: a */
    public final Object f395217a = new Object();

    /* renamed from: b */
    public final String f395218b;

    /* renamed from: c */
    public Object f395219c;

    /* renamed from: d */
    private final Context f395220d;

    /* renamed from: e */
    private final String f395221e;

    /* renamed from: f */
    private boolean f395222f = false;

    /* renamed from: g */
    private boolean f395223g = false;

    public C146318a(Context context, String str, String str2) {
        this.f395220d = context;
        this.f395218b = str;
        this.f395221e = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo122875a(DynamiteModule dynamiteModule, Context context);

    /* renamed from: b */
    public final Object mo122883b() {
        DynamiteModule dynamiteModule;
        synchronized (this.f395217a) {
            Object obj = this.f395219c;
            if (obj != null) {
                return obj;
            }
            Context context = this.f395220d;
            String str = this.f395221e;
            try {
                dynamiteModule = DynamiteModule.m234354d(context, DynamiteModule.f390448d, "com.google.android.gms.vision.dynamite.".concat(str));
            } catch (C144149k unused) {
                String format = String.format("%s.%s", new Object[]{"com.google.android.gms.vision", str});
                C146305f.m238266a("Cannot load thick client module, fall back to load optional module %s", format);
                try {
                    dynamiteModule = DynamiteModule.m234354d(context, DynamiteModule.f390445a, format);
                } catch (C144149k e) {
                    Object[] objArr = {format};
                    if (Log.isLoggable("Vision", 5)) {
                        if (Log.isLoggable("Vision", 3)) {
                            Log.w("Vision", String.format("Error loading optional module %s", objArr), e);
                        } else {
                            Log.w("Vision", String.format("Error loading optional module %s", objArr) + ": " + e.toString());
                        }
                    }
                    dynamiteModule = null;
                }
            }
            if (dynamiteModule == null && !this.f395222f) {
                C146305f.m238266a("Broadcasting download intent for dependency %s", this.f395221e);
                String str2 = this.f395221e;
                Intent intent = new Intent();
                intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str2);
                intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                this.f395220d.sendBroadcast(intent);
                this.f395222f = true;
            }
            if (dynamiteModule != null) {
                try {
                    this.f395219c = mo122875a(dynamiteModule, this.f395220d);
                } catch (RemoteException | C144149k e2) {
                    Log.e(this.f395218b, "Error creating remote native handle", e2);
                }
            }
            if (!this.f395223g) {
                if (this.f395219c == null) {
                    Log.w(this.f395218b, "Native handle not yet available. Reverting to no-op handle.");
                    this.f395223g = true;
                }
            } else if (this.f395219c != null) {
                Log.w(this.f395218b, "Native handle is now available.");
            }
            Object obj2 = this.f395219c;
            return obj2;
        }
    }

    /* renamed from: c */
    public final boolean mo122884c() {
        return mo122883b() != null;
    }
}
