package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.i */
/* compiled from: PG */
public final class C86318i {

    /* renamed from: a */
    private final HashMap f233387a = new HashMap();

    /* renamed from: b */
    private final Context f233388b;

    /* renamed from: c */
    private final C86342v f233389c;

    public C86318i(Context context, C86342v vVar) {
        this.f233388b = context;
        this.f233389c = vVar;
    }

    /* renamed from: a */
    public final synchronized C86338r mo80039a(String str, String str2) {
        Pair pair = new Pair(str, str2);
        if (this.f233387a.containsKey(pair)) {
            return (C86338r) this.f233387a.get(pair);
        }
        C90476a aVar = C91018d.f254254a;
        String path = this.f233388b.getFilesDir().getPath();
        String str3 = File.separator;
        String str4 = File.separator;
        File file = new File(new File(path + str3 + "velour" + str4 + "preferences"), str);
        file.mkdirs();
        C86346z a = this.f233389c.mo80095a(new File(file, str2));
        this.f233387a.put(pair, a);
        return a;
    }
}
