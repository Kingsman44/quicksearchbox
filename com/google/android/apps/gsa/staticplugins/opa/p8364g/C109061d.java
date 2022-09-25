package com.google.android.apps.gsa.staticplugins.opa.p8364g;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.g.d */
/* compiled from: PG */
final class C109061d extends AudioDeviceCallback {

    /* renamed from: b */
    public static final /* synthetic */ int f303607b = 0;

    /* renamed from: a */
    final /* synthetic */ C109063f f303608a;

    public C109061d(C109063f fVar) {
        this.f303608a = fVar;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int type;
        synchronized (this.f303608a.f303612d) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.isSink() && (((type = audioDeviceInfo.getType()) == 8 || type == 7) && !this.f303608a.f303609a.equals(audioDeviceInfo.getAddress()))) {
                    audioDeviceInfo.getAddress();
                    this.f303608a.f303609a = audioDeviceInfo.getAddress();
                    int i = 0;
                    while (true) {
                        C0984n nVar = this.f303608a.f303613e;
                        if (i >= nVar.f3122d) {
                            break;
                        }
                        ((C22871g) this.f303608a.f303613e.mo3708h(i)).mo28212l("BluetoothDeviceManager.onBluetoothDeviceConnected", new C109059b((C109058a) nVar.mo3702e(i)));
                        i++;
                    }
                }
            }
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        synchronized (this.f303608a.f303612d) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (this.f303608a.f303609a.equals(audioDeviceInfo.getAddress())) {
                    audioDeviceInfo.getAddress();
                    this.f303608a.f303609a = BuildConfig.FLAVOR;
                    int i = 0;
                    while (true) {
                        C0984n nVar = this.f303608a.f303613e;
                        if (i >= nVar.f3122d) {
                            break;
                        }
                        ((C22871g) this.f303608a.f303613e.mo3708h(i)).mo28212l("BluetoothDeviceManager.onBluetoothDeviceDisconnected", new C109060c((C109058a) nVar.mo3702e(i)));
                        i++;
                    }
                } else {
                    audioDeviceInfo.getAddress();
                }
            }
        }
    }
}
