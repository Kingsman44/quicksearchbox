package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.e.c.v */
/* compiled from: PG */
public final /* synthetic */ class C92285v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C92286w f257340a;

    /* renamed from: b */
    public final /* synthetic */ String f257341b;

    public /* synthetic */ C92285v(C92286w wVar, String str) {
        this.f257340a = wVar;
        this.f257341b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C92286w wVar = this.f257340a;
        File file = new File(wVar.f257343b.getDir("tisid", 0), this.f257341b);
        if (!file.exists() && !file.mkdirs()) {
            return C58836b.f156633a;
        }
        String path = new File(file, "speaker.profiles").getPath();
        ((C58970a) ((C58970a) C92286w.f257342a.mo56224b()).mo56372aa(12420)).mo56389s("Returned TISID model path: %s", path);
        return C58833ax.m90834k(path);
    }
}
