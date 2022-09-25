package com.google.mediapipe.p4722a;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.p4723b.C62713d;
import com.google.mediapipe.p4723b.C62715f;
import java.nio.FloatBuffer;

/* renamed from: com.google.mediapipe.a.e */
/* compiled from: PG */
public final /* synthetic */ class C62703e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C62706h f169286a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f169287b;

    public /* synthetic */ C62703e(C62706h hVar, SurfaceTexture surfaceTexture) {
        this.f169286a = hVar;
        this.f169287b = surfaceTexture;
    }

    public final void run() {
        C62705g gVar;
        FloatBuffer floatBuffer;
        C62706h hVar = this.f169286a;
        if (this.f169287b == hVar.f169290a) {
            hVar.f169292c = true;
            synchronized (hVar.f169291b) {
                boolean z = false;
                for (C62709k kVar : hVar.f169291b) {
                    synchronized (hVar) {
                        gVar = (C62705g) hVar.f169293d.poll();
                        hVar.f169294e++;
                    }
                    if (gVar == null) {
                        gVar = hVar.mo58584a();
                    } else {
                        if (gVar.f169367c == hVar.f169299j) {
                            if (gVar.f169368d == hVar.f169300k) {
                                C62706h.m94904h(gVar);
                            }
                        }
                        C62706h.m94904h(gVar);
                        C62706h.m94903g(gVar);
                        gVar = hVar.mo58584a();
                    }
                    hVar.mo58598i(gVar.f169366b, hVar.f169299j, hVar.f169300k);
                    C62713d dVar = hVar.f169295f;
                    SurfaceTexture surfaceTexture = hVar.f169290a;
                    GLES20.glClear(16384);
                    GLES20.glActiveTexture(33984);
                    C62715f.m94926c("glActiveTexture");
                    surfaceTexture.updateTexImage();
                    surfaceTexture.getTransformMatrix(dVar.f169341i);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    C62715f.m94926c("glTexParameteri");
                    GLES20.glUseProgram(dVar.f169338f);
                    C62715f.m94926c("glUseProgram");
                    GLES20.glUniform1i(dVar.f169339g, 0);
                    C62715f.m94926c("glUniform1i");
                    GLES20.glUniformMatrix4fv(dVar.f169340h, 1, false, dVar.f169341i, 0);
                    C62715f.m94926c("glUniformMatrix4fv");
                    GLES20.glEnableVertexAttribArray(1);
                    int i = dVar.f169342j;
                    if (i != 1) {
                        floatBuffer = i != 2 ? i != 3 ? C62713d.f169329b : C62713d.f169332e : C62713d.f169331d;
                    } else {
                        floatBuffer = C62713d.f169330c;
                    }
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, floatBuffer);
                    GLES20.glEnableVertexAttribArray(2);
                    GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, C62713d.f169328a);
                    C62715f.m94926c("program setup");
                    GLES20.glDrawArrays(5, 0, 4);
                    C62715f.m94926c("glDrawArrays");
                    GLES20.glBindTexture(36197, 0);
                    C62715f.m94926c("glBindTexture");
                    GLES20.glFinish();
                    long timestamp = hVar.f169290a.getTimestamp() / 1000;
                    if (hVar.f169298i) {
                        long j = hVar.f169297h;
                        if (hVar.f169296g + timestamp <= j) {
                            hVar.f169296g = (j + 1) - timestamp;
                        }
                    }
                    long j2 = timestamp + hVar.f169296g;
                    gVar.f169369e = j2;
                    hVar.f169297h = j2;
                    hVar.f169298i = true;
                    if (kVar != null) {
                        if (Log.isLoggable("ExternalTextureConv", 2)) {
                            Log.v("ExternalTextureConv", String.format("Locking tex: %d width: %d height: %d", new Object[]{Integer.valueOf(gVar.f169366b), Integer.valueOf(gVar.f169367c), Integer.valueOf(gVar.f169368d)}));
                        }
                        synchronized (gVar) {
                            GlSyncToken glSyncToken = gVar.f169371g;
                            if (glSyncToken != null) {
                                glSyncToken.release();
                                gVar.f169371g = null;
                            }
                            gVar.f169370f = true;
                        }
                        kVar.mo18643a(gVar);
                    }
                    z = true;
                }
                if (!z) {
                    hVar.f169290a.updateTexImage();
                }
            }
        }
    }
}
