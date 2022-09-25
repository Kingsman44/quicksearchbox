package com.google.android.libraries.assistant.soda.p1602a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.assistant.soda.a.b */
/* compiled from: PG */
public final class C19237b implements AutoCloseable {

    /* renamed from: a */
    private static final C59071e f53910a = C59071e.m91332i("com.google.android.libraries.assistant.soda.a.b");

    /* renamed from: b */
    private int f53911b = 0;

    /* renamed from: c */
    private final RandomAccessFile f53912c;

    public C19237b(String str, int i, int i2, int i3, boolean z) {
        File file = new File(str);
        if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
            file.createNewFile();
            this.f53912c = new RandomAccessFile(file, "rw");
            m36669c("RIFF");
            m36668b(0, 4);
            m36669c("WAVE");
            m36669c("fmt ");
            m36668b(16, 4);
            if (z) {
                m36668b(3, 2);
            } else {
                m36668b(1, 2);
            }
            m36668b(i3, 2);
            m36668b(i2, 4);
            int i4 = i / 8;
            m36668b(i2 * i3 * i4, 4);
            m36668b(i3 * i4, 2);
            m36668b(i, 2);
            m36669c("data");
            m36668b(0, 4);
            return;
        }
        throw new IOException("Failed to make path ".concat(String.valueOf(String.valueOf(file.getParentFile()))));
    }

    /* renamed from: b */
    private final void m36668b(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f53912c.write((i >> (i3 * 8)) & PrivateKeyType.INVALID);
        }
    }

    /* renamed from: c */
    private final void m36669c(String str) {
        this.f53912c.write(str.getBytes());
    }

    /* renamed from: a */
    public final void mo24387a(byte[] bArr) {
        this.f53911b += bArr.length;
        this.f53912c.write(bArr);
    }

    public final void close() {
        try {
            C58976aa aaVar = C58975e.f156826a;
            this.f53912c.seek(4);
            m36668b(this.f53911b + 36, 4);
            this.f53912c.seek(40);
            m36668b(this.f53911b, 4);
            this.f53912c.getFD().sync();
            this.f53912c.close();
        } catch (IOException e) {
            C59104x c = f53910a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "soda_audio");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(47673)).mo56386p("Failed to properly close");
        }
    }
}
