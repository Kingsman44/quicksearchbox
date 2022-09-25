package com.google.android.gms.gmscompliance.p10800a.p10801a.p10803b;

import android.util.Log;
import com.google.android.gms.libs.p10830b.p10831a.C144833a;
import com.google.android.gms.libs.p10830b.p10831a.C144834b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4017at.p4046e.p4047a.p4048a.C53929j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.gmscompliance.a.a.b.d */
/* compiled from: PG */
final class C144236d {

    /* renamed from: a */
    private C53929j f390680a = null;

    /* renamed from: b */
    private final File f390681b;

    /* renamed from: c */
    private final File f390682c;

    public C144236d(File file) {
        this.f390681b = file;
        this.f390682c = new File(file, "gmscompliance.pb");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C58833ax mo119781a() {
        C58833ax axVar;
        DataInputStream dataInputStream;
        if (this.f390680a == null) {
            File file = this.f390682c;
            if (!file.exists()) {
                Log.w("CacheStorage", "cache doesn't exist");
                axVar = C58836b.f156633a;
            } else if (!file.isFile() || file.length() < 4) {
                Log.e("CacheStorage", "cache is corrupted");
                file.delete();
                axVar = C58836b.f156633a;
            } else {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                    int readInt = dataInputStream.readInt();
                    if (readInt != 1) {
                        Log.e("CacheStorage", "invalid cache version: " + readInt);
                        dataInputStream.close();
                        file.delete();
                        axVar = C58836b.f156633a;
                    } else {
                        int readInt2 = dataInputStream.readInt();
                        if (readInt2 <= 0) {
                            Log.e("CacheStorage", "invalid length: " + readInt2);
                            axVar = C58836b.f156633a;
                        } else {
                            byte[] bArr = new byte[readInt2];
                            dataInputStream.readFully(bArr);
                            C53929j jVar = ((C144834b) C62942bv.parseFrom((C62942bv) C144834b.f391670b, bArr, C62921ba.m95368a())).f391672a;
                            if (jVar != null) {
                                axVar = C58833ax.m90834k(jVar);
                            } else {
                                Log.e("CacheStorage", "message wrapper is empty");
                                axVar = C58836b.f156633a;
                            }
                        }
                        dataInputStream.close();
                    }
                } catch (IOException e) {
                    Log.e("CacheStorage", "error reading cache: ".concat(e.toString()));
                } catch (Throwable th) {
                    C144235c.m234478a(th, th);
                }
            }
            this.f390680a = (C53929j) axVar.mo56111f();
        }
        return C58833ax.m90833j(this.f390680a);
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo119782b(C53929j jVar) {
        DataOutputStream dataOutputStream;
        this.f390680a = null;
        if (!this.f390681b.exists()) {
            if (!this.f390681b.mkdirs()) {
                Log.e("CacheStorage", "failed to create cache dir");
                return;
            }
        }
        if (this.f390682c.exists() && this.f390682c.isDirectory()) {
            if (!this.f390682c.delete()) {
                Log.e("CacheStorage", "failed to delete cache dir collision");
                return;
            }
        }
        C144833a aVar = (C144833a) C144834b.f391670b.createBuilder();
        aVar.copyOnWrite();
        jVar.getClass();
        ((C144834b) aVar.instance).f391672a = jVar;
        byte[] byteArray = ((C144834b) aVar.build()).toByteArray();
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(this.f390682c));
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(byteArray.length);
            dataOutputStream.write(byteArray);
            dataOutputStream.close();
            this.f390680a = jVar;
            return;
        } catch (IOException e) {
            Log.e("CacheStorage", "failed to write cache: ".concat(e.toString()));
            return;
        } catch (Throwable th) {
            C144235c.m234478a(th, th);
        }
        throw th;
    }
}
