package com.google.android.libraries.flashmanagement.p1732a;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.libraries.flashmanagement.a.a */
/* compiled from: PG */
public final class C21386a {

    /* renamed from: a */
    private final Context f59776a;

    /* renamed from: b */
    private final Object f59777b = new Object();

    /* renamed from: c */
    private File f59778c;

    public C21386a(Context context) {
        this.f59776a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final File mo26886a() {
        File file;
        synchronized (this.f59777b) {
            if (this.f59778c == null) {
                this.f59778c = this.f59776a.getDataDir();
            }
            file = this.f59778c;
        }
        return file;
    }
}
