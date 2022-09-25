package com.google.android.libraries.assistant.p1363c.p1382d.p1385c;

import com.evernote.android.state.BuildConfig;
import java.io.File;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.libraries.assistant.c.d.c.b */
/* compiled from: PG */
final class C17211b extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C17211b f49956a = new C17211b();

    public C17211b() {
        super(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        File file = (File) obj;
        C69664n.m101061g(file, "file");
        C69664n.m101061g(file, "<this>");
        String name = file.getName();
        C69664n.m101060f(name, "name");
        return Boolean.valueOf(C69664n.m101066l(C69764m.m101190G(name, BuildConfig.FLAVOR), "so"));
    }
}
