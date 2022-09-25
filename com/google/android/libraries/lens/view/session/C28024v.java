package com.google.android.libraries.lens.view.session;

import androidx.p114h.p115a.C2275g;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.session.v */
/* compiled from: PG */
public final /* synthetic */ class C28024v implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28027y f76270a;

    /* renamed from: b */
    public final /* synthetic */ C27228h f76271b;

    public /* synthetic */ C28024v(C28027y yVar, C27228h hVar) {
        this.f76270a = yVar;
        this.f76271b = hVar;
    }

    public final Object call() {
        C28027y yVar = this.f76270a;
        try {
            InputStream k = this.f76271b.mo32728k(yVar.f76280c);
            C2275g gVar = new C2275g(k);
            try {
                k.close();
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) C28027y.f76278a.mo56225c()).mo56382g(e)).mo56372aa(49938)).mo56386p("Failed to close InputStream");
            }
            return C58833ax.m90834k(gVar);
        } catch (IOException e2) {
            ((C58970a) ((C58970a) ((C58970a) C28027y.f76278a.mo56225c()).mo56382g(e2)).mo56372aa(49937)).mo56386p("Error while getting EXIF data.");
            return C58836b.f156633a;
        }
    }
}
