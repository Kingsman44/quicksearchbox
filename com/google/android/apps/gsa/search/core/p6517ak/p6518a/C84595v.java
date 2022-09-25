package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59071e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.v */
/* compiled from: PG */
final class C84595v extends C90888av {

    /* renamed from: a */
    final /* synthetic */ File f230229a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84595v(File file) {
        super("Delete temporary synthesized TTS file.", 2, 8);
        this.f230229a = file;
    }

    public final void run() {
        this.f230229a.delete();
        C59071e eVar = C84598y.f230232a;
    }
}
