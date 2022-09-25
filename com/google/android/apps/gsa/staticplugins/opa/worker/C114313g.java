package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.os.Environment;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.g */
/* compiled from: PG */
public final /* synthetic */ class C114313g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114507v f316972a;

    /* renamed from: b */
    public final /* synthetic */ Query f316973b;

    /* renamed from: c */
    public final /* synthetic */ C51195j f316974c;

    public /* synthetic */ C114313g(C114507v vVar, Query query, C51195j jVar) {
        this.f316972a = vVar;
        this.f316973b = query;
        this.f316974c = jVar;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        C114507v vVar = this.f316972a;
        Query query = this.f316973b;
        C51195j jVar = this.f316974c;
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "assistant_response");
            file.mkdirs();
            String c = C58890d.m90988c(query.f252770i.replace(' ', '_'));
            String str = vVar.f317522h.mo26870b() + c;
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str + ".textpb"));
            try {
                fileOutputStream = new FileOutputStream(new File(file, str + ".binarypb"));
                fileOutputStream2.write(jVar.toString().getBytes());
                jVar.writeTo(fileOutputStream);
                fileOutputStream.close();
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                fileOutputStream2.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            C59104x c2 = C114507v.f317489a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OpaWorker");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(28841)).mo56386p("write response failed");
        } catch (Throwable th2) {
            C114278d.m189560a(th, th2);
        }
    }
}
