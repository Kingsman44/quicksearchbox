package com.google.android.apps.gsa.staticplugins.p7382aj;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4541l.C59314ab;
import com.google.common.p4541l.C59341x;
import com.google.common.p4541l.C59343z;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.e */
/* compiled from: PG */
final class C93883e extends C90888av {

    /* renamed from: a */
    public volatile boolean f262210a = false;

    /* renamed from: b */
    private final Context f262211b;

    /* renamed from: c */
    private final String f262212c;

    /* renamed from: d */
    private final String f262213d;

    public C93883e(Context context, String str, String str2) {
        super("saveStateDumpToDisk", 2, 8);
        this.f262211b = context;
        this.f262212c = str;
        this.f262213d = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo88202b(String str, String str2) {
        File file = new File(this.f262211b.getCacheDir(), str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                Charset charset = C90772bp.f253863a;
                C59314ab abVar = new C59314ab(file, new C59343z[0]);
                charset.getClass();
                C59341x a = C59341x.m92227a();
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(abVar.mo56801a(), charset);
                    a.mo56859c(outputStreamWriter);
                    outputStreamWriter.append(str2);
                    outputStreamWriter.flush();
                    a.close();
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            } catch (IOException unused) {
                file.delete();
            }
        } catch (IOException unused2) {
            ((C59052c) ((C59052c) C93884f.f262214a.mo56226d()).mo56372aa(19210)).mo56386p("Could not create state dump file.");
        }
    }

    public final void run() {
        mo88202b("shake_redacted_state_dump", this.f262212c);
        mo88202b("shake_nonredacted_state_dump", this.f262213d);
        this.f262210a = true;
        ((C59052c) ((C59052c) C93884f.f262214a.mo56224b()).mo56372aa(19209)).mo56386p("State dumped to disk on shake.");
    }
}
