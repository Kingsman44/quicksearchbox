package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.p8270a;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8265a.C107043b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e.C107058b;
import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import p3186j$.time.Instant;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;
import p3186j$.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.e.a.e */
/* compiled from: PG */
public final class C107053e implements C107058b {

    /* renamed from: a */
    private final C58974d f298094a;

    /* renamed from: b */
    private final Context f298095b;

    /* renamed from: c */
    private final C60887da f298096c;

    /* renamed from: d */
    private final ByteArrayOutputStream f298097d = new ByteArrayOutputStream();

    /* renamed from: e */
    private LocalDate f298098e = LocalDate.now(ZoneId.systemDefault());

    /* renamed from: f */
    private final C107056h f298099f;

    public C107053e(Context context, C60887da daVar, C83564a aVar, C107056h hVar) {
        this.f298095b = context;
        this.f298096c = daVar;
        this.f298094a = aVar.mo76901b(this);
        this.f298099f = hVar;
    }

    /* renamed from: a */
    public final void mo95744a(C53686ak akVar) {
        C107043b.m177757a(this.f298094a, this.f298096c.mo19399b(new C107052d(this, akVar)), "Logging request failed.", new Object[0]);
    }

    /* renamed from: b */
    public final synchronized void mo95746b() {
        FileOutputStream fileOutputStream;
        if (this.f298097d.size() != 0) {
            File file = new File(this.f298095b.getFilesDir(), "hammerspace");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, String.format(Locale.US, "%s_%d_%02d_%02d.pb", new Object[]{"trace", Integer.valueOf(this.f298098e.getYear()), Integer.valueOf(this.f298098e.getMonthValue()), Integer.valueOf(this.f298098e.getDayOfMonth())}));
            try {
                Lock writeLock = ((ReadWriteLock) Map.EL.computeIfAbsent(this.f298099f.f298102a, file2.getAbsolutePath(), C107054f.f298100a)).writeLock();
                writeLock.lock();
                Objects.requireNonNull(writeLock);
                C107055g gVar = new C107055g(writeLock);
                try {
                    fileOutputStream = new FileOutputStream(file2, true);
                    this.f298097d.writeTo(fileOutputStream);
                    this.f298097d.size();
                    this.f298097d.reset();
                    fileOutputStream.close();
                    gVar.close();
                    return;
                } catch (Throwable th) {
                    gVar.close();
                    throw th;
                }
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) this.f298094a.mo56226d()).mo56382g(e)).mo56372aa(23462)).mo56389s("Failure writing to \"%s\"", file2);
                return;
            } catch (Throwable th2) {
                C107051c.m177766a(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: c */
    public final synchronized void mo95747c(C53686ak akVar) {
        C63042fg fgVar = akVar.f140918d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        LocalDate localDate = Instant.ofEpochMilli(C62953e.m95478c(fgVar)).atZone(ZoneId.systemDefault()).toLocalDate();
        if (this.f298097d.size() >= 512 || !this.f298098e.equals(localDate)) {
            mo95746b();
        }
        try {
            akVar.writeDelimitedTo(this.f298097d);
            this.f298098e = localDate;
            akVar.getSerializedSize();
            this.f298097d.size();
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) this.f298094a.mo56226d()).mo56382g(e)).mo56372aa(23464)).mo56386p("Failure writing to buffer");
        }
    }
}
