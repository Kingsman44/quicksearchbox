package com.google.android.libraries.search.p2904c.p2916e.p2925c.p2926a;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.android.libraries.search.c.e.c.a.a */
/* compiled from: PG */
public final class C37541a extends ParcelFileDescriptor.AutoCloseInputStream implements InputStreamRetargetInterface, C37559f {

    /* renamed from: a */
    private static final C59071e f99733a = C59071e.m91332i("com.google.android.libraries.search.c.e.c.a.a");

    /* renamed from: b */
    private final AtomicBoolean f99734b = new AtomicBoolean(false);

    public C37541a(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor);
    }

    /* renamed from: a */
    public final void mo41012a() {
        this.f99734b.set(true);
        super.close();
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = super.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            return -1;
        } catch (IOException e) {
            if (this.f99734b.get()) {
                ((C59052c) ((C59052c) f99733a.mo56224b()).mo56372aa(52744)).mo56386p("#audio# IOException is ignored as the AudioPfdStream has been closed intentionally.");
                return -1;
            }
            throw e;
        }
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
