package com.bumptech.glide.load.p297b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.C5997p;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5929d;
import com.bumptech.glide.load.data.C5930e;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.b.ai */
/* compiled from: PG */
final class C5757ai implements C5930e {

    /* renamed from: a */
    private static final String[] f17337a = {"_data"};

    /* renamed from: b */
    private final Context f17338b;

    /* renamed from: c */
    private final Uri f17339c;

    public C5757ai(Context context, Uri uri) {
        this.f17338b = context;
        this.f17339c = uri;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return File.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
    }

    /* renamed from: e */
    public final void mo11925e(C5997p pVar, C5929d dVar) {
        Cursor query = this.f17338b.getContentResolver().query(this.f17339c, f17337a, (String) null, (String[]) null, (String) null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            dVar.mo12184g(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.f17339c)))));
        } else {
            dVar.mo12183f(new File(str));
        }
    }
}
