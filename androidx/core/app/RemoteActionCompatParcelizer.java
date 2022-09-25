package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C4265d;

/* compiled from: PG */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(C4265d dVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f5556a = (IconCompat) dVar.mo9105j(remoteActionCompat.f5556a, 1);
        remoteActionCompat.f5557b = dVar.mo9107l(remoteActionCompat.f5557b, 2);
        remoteActionCompat.f5558c = dVar.mo9107l(remoteActionCompat.f5558c, 3);
        remoteActionCompat.f5559d = (PendingIntent) dVar.mo9102g(remoteActionCompat.f5559d, 4);
        remoteActionCompat.f5560e = dVar.mo9092C(remoteActionCompat.f5560e, 5);
        remoteActionCompat.f5561f = dVar.mo9092C(remoteActionCompat.f5561f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, C4265d dVar) {
        IconCompat iconCompat = remoteActionCompat.f5556a;
        dVar.mo9111p(1);
        dVar.mo9090A(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5557b;
        dVar.mo9111p(2);
        dVar.mo9116u(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f5558c;
        dVar.mo9111p(3);
        dVar.mo9116u(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f5559d;
        dVar.mo9111p(4);
        dVar.mo9119x(pendingIntent);
        boolean z = remoteActionCompat.f5560e;
        dVar.mo9111p(5);
        dVar.mo9113r(z);
        boolean z2 = remoteActionCompat.f5561f;
        dVar.mo9111p(6);
        dVar.mo9113r(z2);
    }
}
