package com.google.android.libraries.assistant.gallium.framework.p1507b.p1508a;

import android.content.Context;
import com.google.android.libraries.assistant.gallium.framework.C18309l;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18228f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.b.a.b */
/* compiled from: PG */
public abstract class C18223b implements C18226d {

    /* renamed from: e */
    private static final C59071e f51768e = C59071e.m91332i("com.google.android.libraries.assistant.gallium.framework.b.a.b");

    /* renamed from: a */
    public final boolean f51769a;

    /* renamed from: b */
    protected final Context f51770b;

    /* renamed from: c */
    public final File f51771c;

    /* renamed from: d */
    public final File f51772d;

    protected C18223b(Context context, boolean z) {
        this.f51770b = context;
        this.f51769a = z;
        if (z) {
            File file = new File(context.getFilesDir(), "platform.dill");
            this.f51771c = file;
            File file2 = new File(context.getFilesDir(), "gallium.dill");
            this.f51772d = file2;
            try {
                m35496e(context, mo23713d(), file);
                try {
                    m35496e(context, mo23712c(), file2);
                } catch (IOException e) {
                    throw new IOException("Unable to initialize: ".concat(String.valueOf(this.f51772d.getName())), e);
                }
            } catch (IOException e2) {
                throw new IOException("Unable to initialize: ".concat(String.valueOf(this.f51771c.getName())), e2);
            }
        } else {
            this.f51771c = null;
            this.f51772d = null;
        }
    }

    /* renamed from: e */
    private static void m35496e(Context context, int i, File file) {
        FileOutputStream fileOutputStream;
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            fileOutputStream = new FileOutputStream(file);
            C59332o.m92211b(openRawResource, fileOutputStream);
            ((C59052c) ((C59052c) f51768e.mo56224b()).mo56372aa(47074)).mo56353F("Copied resource to file: %s (%s bytes).", file, file.length());
            fileOutputStream.close();
            if (openRawResource != null) {
                openRawResource.close();
                return;
            }
            return;
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    C18222a.m35495a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }

    /* renamed from: a */
    public C18309l mo23711a(C18228f fVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo23712c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo23713d();
}
