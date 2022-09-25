package com.google.android.gms.mobstore;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.storage.p3304a.p3305a.C42731r;
import com.google.android.libraries.storage.p3304a.p3307c.C42763p;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3313g.C42798a;
import com.google.android.libraries.storage.p3304a.p3313g.C42799b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58885cv;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.mobstore.g */
/* compiled from: PG */
public final class C145559g implements C42799b {

    /* renamed from: a */
    public final C58881cr f393600a;

    /* renamed from: b */
    private final C42763p f393601b;

    public C145559g(Context context) {
        this(context, new C42763p());
    }

    /* renamed from: p */
    private final ParcelFileDescriptor m236622p(Uri uri, int i) {
        return (ParcelFileDescriptor) m236623q("open file", new C145556d(this, uri, i));
    }

    /* renamed from: q */
    private static final Object m236623q(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof C143842n) {
                Status status = ((C143842n) cause).f389919a;
                String str2 = status.f389622h;
                int i = status.f389621g;
                if (i == 33500) {
                    throw new FileNotFoundException("Unable to " + str + " because " + str2);
                } else if (i == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    throw new FileNotFoundException("Unable to " + str + " because " + str2);
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ long mo45825a(Uri uri) {
        return C42798a.m75574e(this);
    }

    /* renamed from: b */
    public final Pair mo45812b(Uri uri) {
        return C42731r.m75493a(m236622p(uri, 0));
    }

    /* renamed from: c */
    public final C42763p mo45826c() {
        return this.f393601b;
    }

    /* renamed from: d */
    public final /* synthetic */ File mo45813d(Uri uri) {
        return C42798a.m75570a(this, uri);
    }

    /* renamed from: e */
    public final InputStream mo45814e(Uri uri) {
        return new C145557e(m236622p(uri, 0));
    }

    /* renamed from: f */
    public final /* synthetic */ OutputStream mo45827f(Uri uri) {
        return C42798a.m75575f(this);
    }

    /* renamed from: g */
    public final OutputStream mo45828g(Uri uri) {
        return new C145558f(m236622p(uri, 1));
    }

    /* renamed from: h */
    public final /* synthetic */ Iterable mo45829h(Uri uri) {
        return C42798a.m75571b(this);
    }

    /* renamed from: i */
    public final String mo45815i() {
        return "android";
    }

    /* renamed from: j */
    public final /* synthetic */ void mo45830j(Uri uri) {
        C42798a.m75572c(this);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo45831k(Uri uri) {
        C42798a.m75573d(this);
    }

    /* renamed from: l */
    public final void mo45832l(Uri uri) {
        m236623q("delete file", new C145554b(this, uri));
    }

    /* renamed from: m */
    public final void mo45833m(Uri uri, Uri uri2) {
        m236623q("rename file", new C145555c(this, uri, uri2));
    }

    /* renamed from: n */
    public final boolean mo45816n(Uri uri) {
        try {
            ParcelFileDescriptor p = m236622p(uri, 0);
            if (p == null) {
                return true;
            }
            p.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final /* synthetic */ boolean mo45834o(Uri uri) {
        throw new C42768u("isDirectory not supported by android");
    }

    public C145559g(Context context, C42763p pVar) {
        this.f393600a = new C58885cv(C145564l.m236643a(context.getApplicationContext()));
        this.f393601b = pVar;
    }
}
