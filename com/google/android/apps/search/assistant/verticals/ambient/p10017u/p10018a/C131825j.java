package com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131815a;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131836h;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131837i;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p4016z.C53686ak;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.time.LocalDate;
import p3186j$.time.ZoneId;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.u.a.j */
/* compiled from: PG */
public final class C131825j implements C131837i {

    /* renamed from: a */
    public final C58974d f360025a;

    /* renamed from: b */
    public final Context f360026b;

    /* renamed from: c */
    public final C63087y f360027c = C63088z.m96150v();

    /* renamed from: d */
    public LocalDate f360028d;

    /* renamed from: e */
    private final C60887da f360029e;

    /* renamed from: f */
    private final C47632e f360030f = new C47632e();

    public C131825j(Context context, C60887da daVar, C130603a aVar, C60950i iVar) {
        this.f360026b = context;
        this.f360029e = daVar;
        this.f360025a = aVar.mo109740b(this);
        this.f360028d = iVar.mo57445b(ZoneId.systemDefault());
    }

    /* renamed from: a */
    public final C131836h mo110317a() {
        C131815a aVar = new C131815a();
        aVar.mo110316d();
        aVar.mo110315c(true);
        aVar.mo110314b(true);
        return aVar.mo110313a();
    }

    /* renamed from: b */
    public final C60870cx mo110318b(String str) {
        return this.f360030f.mo51511a(new C131819d(this, str), this.f360029e);
    }

    /* renamed from: c */
    public final C60870cx mo110319c() {
        return this.f360030f.mo51511a(new C131820e(this), this.f360029e);
    }

    /* renamed from: d */
    public final Duration mo110320d() {
        return Duration.ofHours(24);
    }

    /* renamed from: e */
    public final void mo110321e(C53686ak akVar) {
        C46459k.m82829b(this.f360030f.mo51511a(new C131818c(this, akVar), this.f360029e), "Logging request failed.", new Object[0]);
    }

    /* renamed from: f */
    public final void mo110326f() {
        C63088z[] zVarArr;
        byte[] bArr;
        int i;
        if (this.f360027c.mo59164a() != 0) {
            File file = new File(this.f360026b.getFilesDir(), "ambient");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file, String.format(Locale.US, "%s_%d_%02d_%02d.pb", new Object[]{"trace", Integer.valueOf(this.f360028d.getYear()), Integer.valueOf(this.f360028d.getMonthValue()), Integer.valueOf(this.f360028d.getDayOfMonth())}));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
                try {
                    C63087y yVar = this.f360027c;
                    synchronized (yVar) {
                        zVarArr = (C63088z[]) yVar.f170241a.toArray(new C63088z[0]);
                        bArr = yVar.f170242b;
                        i = yVar.f170243c;
                    }
                    for (C63088z r : zVarArr) {
                        r.mo59046r(fileOutputStream);
                    }
                    fileOutputStream.write(Arrays.copyOf(bArr, i));
                    this.f360027c.mo59166c();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) this.f360025a.mo56226d()).mo56382g(e)).mo56372aa(39323)).mo56389s("Failure writing to \"%s\"", file2);
            } catch (Throwable th2) {
                C131817b.m214297a(th, th2);
            }
        }
    }
}
