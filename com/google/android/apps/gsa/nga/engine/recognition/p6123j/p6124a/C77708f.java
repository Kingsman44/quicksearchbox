package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.f */
/* compiled from: PG */
public final /* synthetic */ class C77708f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InputStream f214047a;

    public /* synthetic */ C77708f(InputStream inputStream) {
        this.f214047a = inputStream;
    }

    public final void run() {
        InputStream inputStream = this.f214047a;
        try {
            ((C58970a) ((C58970a) C77710h.f214049a.mo56224b()).mo56372aa(4377)).mo56386p("Closing S3 Mic.");
            inputStream.close();
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C77710h.f214049a.mo56226d()).mo56382g(e)).mo56372aa(4378)).mo56386p("Failed to close S3 Mic.");
        }
    }
}
