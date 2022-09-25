package com.google.android.apps.gsa.staticplugins.opa.zerostate.contentproviders.image;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class SnapshotImageContentProvider extends C90494d {

    /* renamed from: c */
    private static final C59071e f318317c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.contentproviders.image.SnapshotImageContentProvider");

    /* renamed from: d */
    private static final C58485gu f318318d = C58485gu.m89847o("_display_name", "_size");

    /* renamed from: e */
    private static final Duration f318319e = Duration.ofSeconds(2);

    /* renamed from: a */
    public C91189au f318320a;

    /* renamed from: b */
    public C22871g f318321b;

    /* renamed from: f */
    private final AtomicBoolean f318322f = new AtomicBoolean(false);

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.contentproviders.image.SnapshotImageContentProvider$a */
    /* compiled from: PG */
    public interface C114713a {
        /* renamed from: qV */
        void mo101540qV(SnapshotImageContentProvider snapshotImageContentProvider);
    }

    /* renamed from: a */
    private static Uri m190151a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        C58838bb.m90873h(pathSegments.size() == 2, "expected 2 path segments in uri {%s}", uri);
        String str = pathSegments.get(0);
        C58838bb.m90879n("image".equals(str), "unsupported type %s in uri {%s}", str, uri);
        String str2 = new String(C59326i.f157517e.mo56836k(pathSegments.get(1)), C58913w.f156754c);
        C58976aa aaVar = C58975e.f156826a;
        return Uri.parse(str2);
    }

    /* renamed from: b */
    private final C60870cx m190152b(Uri uri) {
        return this.f318320a.mo85424l(uri, C58836b.f156633a);
    }

    /* renamed from: c */
    private static File m190153c(Context context) {
        return new File(context.getCacheDir(), "opa_snapshot");
    }

    /* renamed from: d */
    private final synchronized void m190154d() {
        if (this.f318322f.compareAndSet(false, true)) {
            Context context = getContext();
            context.getClass();
            ((C114713a) C47266f.m84076a(context, C114713a.class)).mo101540qV(this);
            Context context2 = getContext();
            context2.getClass();
            File c = m190153c(context2);
            if (c.exists()) {
                File[] listFiles = c.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            }
        }
        this.f318320a.getClass();
        this.f318321b.getClass();
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        m190154d();
        return "image/jpeg";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r9 = r2.mo56225c();
        r9.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ZSImageContentProvider");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(29352)).mo56389s("Unable to delete temporary file %s", r1.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bc, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        r1 = f318317c.mo56225c();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "ZSImageContentProvider");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(29350)).mo56389s("Unable to get image bytes: %s", r9.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007d */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc A[ExcHandler: InterruptedException (r9v3 'e' java.lang.InterruptedException A[CUSTOM_DECLARE]), Splitter:B:6:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ZSImageContentProvider"
            r1 = 10
            com.google.android.apps.gsa.p5846e.C74507e.m120470f(r1)
            r8.m190154d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "r"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x00d4
            android.net.Uri r9 = m190151a(r9)
            android.content.Context r10 = r8.getContext()
            r10.getClass()
            java.io.File r10 = m190153c(r10)
            boolean r1 = r10.exists()
            if (r1 != 0) goto L_0x002c
            r10.mkdirs()
        L_0x002c:
            r10 = 0
            java.lang.String r1 = "image_"
            java.lang.String r2 = ""
            android.content.Context r3 = r8.getContext()     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x0080 }
            r3.getClass()
            java.io.File r3 = m190153c(r3)     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x0080 }
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x0080 }
            r1.createNewFile()     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
            r2.<init>(r1)     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
            com.google.common.util.concurrent.cx r9 = r8.m190152b(r9)     // Catch:{ all -> 0x0060 }
            java.lang.Object r9 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r9)     // Catch:{ all -> 0x0060 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0060 }
            r2.write(r9)     // Catch:{ all -> 0x0060 }
            r2.close()     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r10 = android.os.ParcelFileDescriptor.open(r1, r9)     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
            goto L_0x00d3
        L_0x0060:
            r9 = move-exception
            r2.close()     // Catch:{ all -> 0x0065 }
            goto L_0x007d
        L_0x0065:
            r2 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x007d }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x007d }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r7, r4)     // Catch:{ Exception -> 0x007d }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x007d }
            r3[r6] = r2     // Catch:{ Exception -> 0x007d }
            r4.invoke(r9, r3)     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            throw r9     // Catch:{ InterruptedException -> 0x00bc, Exception -> 0x007e }
        L_0x007e:
            r9 = move-exception
            goto L_0x0082
        L_0x0080:
            r9 = move-exception
            r1 = r10
        L_0x0082:
            com.google.common.f.e r2 = f318317c
            com.google.common.f.x r3 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r0)
            java.lang.String r9 = r9.getMessage()
            r4 = 29351(0x72a7, float:4.113E-41)
            java.lang.String r5 = "Unable to create temporary image file and write data: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r4)).mo56389s(r5, r9)
            if (r1 == 0) goto L_0x00d3
            boolean r9 = r1.exists()
            if (r9 == 0) goto L_0x00d3
            boolean r9 = r1.delete()
            if (r9 == 0) goto L_0x00a7
            goto L_0x00d3
        L_0x00a7:
            com.google.common.f.x r9 = r2.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r2, r0)
            java.lang.String r0 = r1.getAbsolutePath()
            r1 = 29352(0x72a8, float:4.1131E-41)
            java.lang.String r2 = "Unable to delete temporary file %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56389s(r2, r0)
            return r10
        L_0x00bc:
            r9 = move-exception
            com.google.common.f.e r1 = f318317c
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r0)
            java.lang.String r9 = r9.getMessage()
            r0 = 29350(0x72a6, float:4.1128E-41)
            java.lang.String r2 = "Unable to get image bytes: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r0)).mo56389s(r2, r9)
        L_0x00d3:
            return r10
        L_0x00d4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported mode: "
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r0.concat(r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.contentproviders.image.SnapshotImageContentProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C74507e.m120471g(10);
        m190154d();
        C58976aa aaVar = C58975e.f156826a;
        if (strArr == null) {
            strArr = (String[]) f318318d.toArray(new String[0]);
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, 1);
        Uri a = m190151a(uri);
        MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
        newRow.add("_display_name", "image");
        if (matrixCursor.getColumnIndex("_size") >= 0) {
            try {
                byte[] bArr = (byte[]) C90877ak.m148473g(m190152b(a), f318319e.toMillis(), TimeUnit.MILLISECONDS);
                if (bArr != null) {
                    newRow.add("_size", Integer.valueOf(bArr.length));
                } else {
                    throw new IOException();
                }
            } catch (IOException | ExecutionException | TimeoutException e) {
                C59104x d = f318317c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ZSImageContentProvider");
                ((C59052c) ((C59052c) d).mo56372aa(29347)).mo56354G("#query: failed reading image {%s}: %s", a, e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw SnapshotImageContentProvider$$ExternalSyntheticBackport0.m190156m("InterruptedException caught", e2);
            }
        }
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
