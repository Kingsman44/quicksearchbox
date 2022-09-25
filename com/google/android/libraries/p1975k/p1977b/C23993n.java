package com.google.android.libraries.p1975k.p1977b;

import android.content.Context;
import android.provider.Settings;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.k.b.n */
/* compiled from: PG */
final class C23993n implements C23985f {

    /* renamed from: a */
    public static volatile C23993n f65589a;

    /* renamed from: b */
    public static final Object f65590b = new Object();

    /* renamed from: c */
    public final Context f65591c;

    /* renamed from: d */
    private final C23991l f65592d;

    /* renamed from: e */
    private C58833ax f65593e = C58836b.f156633a;

    /* renamed from: f */
    private final Object f65594f = new Object();

    public C23993n(Context context, C23991l lVar) {
        this.f65591c = context.getApplicationContext();
        this.f65592d = lVar;
    }

    /* renamed from: a */
    public final boolean mo29397a() {
        boolean booleanValue;
        synchronized (this.f65594f) {
            booleanValue = this.f65593e.mo56113h() ? ((Boolean) this.f65593e.mo56107c()).booleanValue() : mo29403b();
        }
        return booleanValue;
    }

    /* renamed from: b */
    public final boolean mo29403b() {
        boolean z;
        synchronized (this.f65594f) {
            try {
                z = true;
                if (Settings.Global.getInt(this.f65592d.f65587a.getContentResolver(), "multi_cb") != 1) {
                    z = false;
                }
                this.f65593e = C58833ax.m90834k(Boolean.valueOf(z));
            } catch (Settings.SettingNotFoundException unused) {
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
