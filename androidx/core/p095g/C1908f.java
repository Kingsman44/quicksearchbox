package androidx.core.p095g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.p091b.C1861j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.core.g.f */
/* compiled from: PG */
public final class C1908f {

    /* renamed from: a */
    private static final Comparator f5783a = C1906d.f5782a;

    /* JADX WARNING: type inference failed for: r13v3, types: [androidx.core.g.o[], android.database.Cursor] */
    /* renamed from: a */
    public static C1916n m5173a(Context context, C1909g gVar, CancellationSignal cancellationSignal) {
        Cursor cursor;
        Uri uri;
        C1909g gVar2 = gVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = gVar2.f5784a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
        } else if (resolveContentProvider.packageName.equals(gVar2.f5785b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, f5783a);
            List list = gVar2.f5787d;
            if (list == null) {
                list = C1861j.m5088a(resources, gVar2.f5788e);
            }
            int i = 0;
            loop1:
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, f5783a);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            i2++;
                        }
                    }
                    break loop1;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new C1916n(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = C1907e.m5172a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{gVar2.f5786c}, (String) null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                        int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        arrayList3.add(new C1917o(uri, i4, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i3));
                    }
                }
                return new C1916n(0, (C1917o[]) arrayList3.toArray(new C1917o[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + gVar2.f5785b);
        }
    }
}
