package com.google.android.apps.gsa.staticplugins.recently.p8679b;

import android.graphics.Movie;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.b.f */
/* compiled from: PG */
public final /* synthetic */ class C116030f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C116032h f321724a;

    /* renamed from: b */
    public final /* synthetic */ long f321725b;

    public /* synthetic */ C116030f(C116032h hVar, long j) {
        this.f321724a = hVar;
        this.f321725b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C116032h hVar = this.f321724a;
        long j = this.f321725b;
        String str = hVar.f321731d;
        str.getClass();
        FileInputStream fileInputStream = new FileInputStream(hVar.mo102426a(str, j));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr, 0, 8192);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                fileInputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return Movie.decodeByteArray(byteArray, 0, byteArray.length);
            }
        }
    }
}
