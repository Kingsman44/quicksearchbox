package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.preference.u */
/* compiled from: PG */
final class C4025u implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final Preference f12887a;

    public C4025u(Preference preference) {
        this.f12887a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence m = this.f12887a.mo8328m();
        if (this.f12887a.f12717C && !TextUtils.isEmpty(m)) {
            contextMenu.setHeaderTitle(m);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence m = this.f12887a.mo8328m();
        ((ClipboardManager) this.f12887a.f12738j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", m));
        if (Build.VERSION.SDK_INT <= 32) {
            Context context = this.f12887a.f12738j;
            Toast.makeText(context, context.getString(R.string.preference_copied, new Object[]{m}), 0).show();
        }
        return true;
    }
}
