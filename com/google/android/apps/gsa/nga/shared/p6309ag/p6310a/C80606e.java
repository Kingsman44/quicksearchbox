package com.google.android.apps.gsa.nga.shared.p6309ag.p6310a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90778bv;
import com.google.android.libraries.p11029ao.p11031b.C147799a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.C60790c;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.p5610a.p5611a.p5612a.C71978d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.a.e */
/* compiled from: PG */
public final class C80606e {

    /* renamed from: a */
    public static final Locale f221278a = Locale.US;

    /* renamed from: c */
    private static final C58974d f221279c = C58974d.m91136j();

    /* renamed from: b */
    public final C68214a f221280b;

    /* renamed from: d */
    private final Context f221281d;

    public C80606e(Context context, C68214a aVar) {
        this.f221281d = context;
        this.f221280b = aVar;
    }

    /* renamed from: a */
    public static void m128233a(InputStream inputStream, File file) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
        try {
            int a = C90778bv.m148331a(gZIPInputStream, file, (String) null);
            if (a == 1) {
                gZIPInputStream.close();
                return;
            }
            throw new C80604c(String.format(Locale.US, "Failed to unpack data, ZipUtil returned with %d", new Object[]{Integer.valueOf(a)}));
        } catch (Throwable th) {
            C80602a.m128232a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m128234b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* renamed from: c */
    public static boolean m128235c(String str) {
        FileInputStream a;
        boolean z = true;
        String a2 = C60790c.m92793a(str, "metadata");
        try {
            a = C71978d.m105260a(new File(a2));
            C8476as asVar = (C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, (InputStream) a, C62921ba.m95368a());
            if (asVar.f29419d < (true != asVar.f29417b.equals("en-US") ? 500 : 506)) {
                z = false;
            }
            a.close();
            return z;
        } catch (IOException unused) {
            ((C58970a) ((C58970a) f221279c.mo56226d()).mo56372aa(6139)).mo56389s("Soda metadata file not found inside following path %s ", a2);
            return false;
        } catch (Throwable th) {
            C80602a.m128232a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo74364d(String str, boolean z) {
        File file = new File(str);
        if (m128234b(file) || z) {
            InputStream e = mo74365e("SODA");
            try {
                m128233a(e, file);
                if (e != null) {
                    e.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C80602a.m128232a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: e */
    public final InputStream mo74365e(String str) {
        String concat = String.valueOf(str).concat(".zip.gz");
        Context createPackageContext = this.f221281d.createPackageContext("com.google.android.googlequicksearchbox.nga_resources", 0);
        int b = C147799a.m240900b(this.f221281d.getPackageManager(), this.f221281d.getPackageName(), createPackageContext.getPackageName());
        if (b == 0) {
            return createPackageContext.getAssets().open(concat);
        }
        throw new C80605d(String.format(Locale.US, "The resource package %s was not signed correctly: %d", new Object[]{"com.google.android.googlequicksearchbox.nga_resources", Integer.valueOf(b)}));
    }
}
