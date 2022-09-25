package com.google.android.libraries.assistant.hotword;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.libraries.assistant.hotword.p */
/* compiled from: PG */
final class C18379p {

    /* renamed from: a */
    public final ByteArrayOutputStream f52155a = new ByteArrayOutputStream();

    /* renamed from: b */
    public int f52156b;

    /* renamed from: c */
    public int f52157c;

    /* renamed from: d */
    private final String f52158d;

    /* renamed from: e */
    private FileOutputStream f52159e;

    public C18379p(String str) {
        C59071e eVar = C18380q.f52160a;
        C58976aa aaVar = C58975e.f156826a;
        this.f52158d = str;
        try {
            this.f52159e = new FileOutputStream(str, false);
        } catch (IOException e) {
            C59104x c = C18380q.f52160a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(47159)).mo56389s("%sCould not create debug audio file.", "DumpPreambleAudio#");
        }
    }

    /* renamed from: a */
    public final void mo23883a() {
        C59104x c;
        char c2;
        if (this.f52159e != null) {
            C59071e eVar = C18380q.f52160a;
            C58976aa aaVar = C58975e.f156826a;
            try {
                this.f52159e.write(this.f52155a.toByteArray());
                FileOutputStream fileOutputStream = this.f52159e;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        this.f52159e.close();
                    } catch (IOException e) {
                        e = e;
                        c = C18380q.f52160a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
                        c2 = 47161;
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(c2)).mo56389s("%sIOException", "DumpPreambleAudio#");
                    }
                }
            } catch (IOException e2) {
                C59104x c3 = C18380q.f52160a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(47162)).mo56359L("%sFailed to create captured audio file %s : %s", "DumpPreambleAudio#", this.f52158d, e2.getMessage());
                FileOutputStream fileOutputStream2 = this.f52159e;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        this.f52159e.close();
                    } catch (IOException e3) {
                        e = e3;
                        c = C18380q.f52160a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
                        c2 = 47163;
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(c2)).mo56389s("%sIOException", "DumpPreambleAudio#");
                    }
                }
            } catch (Throwable th) {
                FileOutputStream fileOutputStream3 = this.f52159e;
                if (fileOutputStream3 != null) {
                    try {
                        fileOutputStream3.flush();
                        this.f52159e.close();
                    } catch (IOException e4) {
                        C59104x c4 = C18380q.f52160a.mo56225c();
                        c4.mo56378ag(C58975e.f156826a, "HotwordRecognitionRnr");
                        ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(47164)).mo56389s("%sIOException", "DumpPreambleAudio#");
                    }
                }
                throw th;
            }
        }
    }
}
